class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public static void main(String[] args) {
        // Test Case 1
        CircularQueue queue1 = new CircularQueue(4);
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        System.out.println("Is Full: " + queue1.isFull()); // Output: True

        // Test Case 2
        CircularQueue queue2 = new CircularQueue(3);
        queue2.enqueue(5);
        queue2.enqueue(6);
        queue2.dequeue();
        queue2.enqueue(7);
        System.out.println("Is Empty: " + queue2.isEmpty()); // Output: False
    }
}
