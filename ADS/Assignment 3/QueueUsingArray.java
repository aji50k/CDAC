class QueueUsingArray{
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == queueArray.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = element;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;
        return dequeuedElement;
    }

    public void displayQueue() {
        if (size == 0) {
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

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Test Case 1
        System.out.println("Test Case 1:");
        queue.enqueue(5);
        queue.enqueue(10);
        queue.displayQueue();
        int dequeuedElement1 = queue.dequeue();
        queue.displayQueue();
        System.out.println("Dequeued element = " + dequeuedElement1);
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.displayQueue();
        int dequeuedElement2 = queue.dequeue();
        int dequeuedElement3 = queue.dequeue();
        queue.displayQueue();
        System.out.println("Dequeued elements = " + dequeuedElement2 + ", " + dequeuedElement3);
    }
}
