import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
    }

    public void add(int num) {
        if (minHeap.size() < k) {
            minHeap.add(num);
        } else if (num > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(num);
        }
    }

    public int getKthLargest() {
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Test Case 1
        KthLargest kthLargest = new KthLargest(3);
        int[] stream1 = {3, 10, 5, 20, 15};
        for (int num : stream1) {
            kthLargest.add(num);
        }
        System.out.println("Test Case 1: " + kthLargest.getKthLargest()); // Output: 10

        // Test Case 2
        KthLargest kthLargest2 = new KthLargest(2);
        int[] stream2 = {7, 4, 8, 2, 9};
        for (int num : stream2) {
            kthLargest2.add(num);
        }
        System.out.println("Test Case 2: " + kthLargest2.getKthLargest()); // Output: 8
    }
}
