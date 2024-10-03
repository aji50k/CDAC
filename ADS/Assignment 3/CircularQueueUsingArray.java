class CircularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        queueArray = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int dequeuedElement = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return dequeuedElement;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue = [");
            for (int i = 0; i < size; i++) {
                System.out.print(queueArray[(front + i) % queueArray.length]);
                if (i < size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queueArray.length;
    }
}

public class CircularQueueUsingArray {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Test Case 1
        System.out.println("Test Case 1:");
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.displayQueue();
        queue.dequeue();
        queue.enqueue(8);
        queue.displayQueue();
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.displayQueue();
    }
}
