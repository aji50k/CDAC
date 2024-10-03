import java.util.PriorityQueue;
import java.util.Comparator;

class PriorityElement {
    int value;
    int priority;

    public PriorityElement(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

class PriorityQueueHeap {
    private PriorityQueue<PriorityElement> maxHeap;

    public PriorityQueueHeap() {
        maxHeap = new PriorityQueue<>(Comparator.comparingInt(e -> -e.priority));
    }

    public void enqueue(int value, int priority) {
        maxHeap.add(new PriorityElement(value, priority));
    }

    public PriorityElement dequeue() {
        return maxHeap.poll();
    }

    public void displayQueue() {
        maxHeap.forEach(e -> System.out.print(e.value + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1
        PriorityQueueHeap queue = new PriorityQueueHeap();
        queue.enqueue(3, 1);
        queue.enqueue(10, 3);
        queue.enqueue(5, 2);
        PriorityElement removed1 = queue.dequeue();
        System.out.println("Dequeued element = " + removed1.value + " (highest priority)");
        queue.displayQueue(); // Output: [5, 3]

        // Test Case 2
        PriorityQueueHeap queue2 = new PriorityQueueHeap();
        queue2.enqueue(7, 4);
        queue2.enqueue(8, 2);
        queue2.enqueue(6, 3);
        PriorityElement removed2 = queue2.dequeue();
        System.out.println("Dequeued element = " + removed2.value);
        queue2.displayQueue(); // Output: [6, 8]
    }
}
