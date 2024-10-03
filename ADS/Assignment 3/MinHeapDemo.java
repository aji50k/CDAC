import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int extractMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }
        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) < heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
                smallest = leftChild;
            }

            if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
                smallest = rightChild;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void displayHeap() {
        System.out.println("Min-Heap = " + heap);
    }
}

public class MinHeapDemo {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Test Case 1
        System.out.println("Test Case 1:");
        minHeap.insert(10);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(17);
        minHeap.displayHeap();
        int min1 = minHeap.extractMin();
        minHeap.displayHeap();
        System.out.println("Extracted Min = " + min1);
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(20);
        minHeap.insert(50);
        minHeap.displayHeap();
        int min2 = minHeap.extractMin();
        minHeap.displayHeap();
        System.out.println("Extracted Min = " + min2);
    }
}
