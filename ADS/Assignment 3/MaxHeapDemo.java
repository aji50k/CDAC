import java.util.ArrayList;

class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int extractMax() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) > heap.get(parentIndex)) {
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
            int largest = index;

            if (leftChild < size && heap.get(leftChild) > heap.get(largest)) {
                largest = leftChild;
            }

            if (rightChild < size && heap.get(rightChild) > heap.get(largest)) {
                largest = rightChild;
            }

            if (largest != index) {
                swap(index, largest);
                index = largest;
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
        System.out.println("Max-Heap = " + heap);
    }
}

public class MaxHeapDemo {

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        // Test Case 1
        System.out.println("Test Case 1:");
        maxHeap.insert(12);
        maxHeap.insert(7);
        maxHeap.insert(15);
        maxHeap.insert(5);
        maxHeap.displayHeap();
        int max1 = maxHeap.extractMax();
        maxHeap.displayHeap();
        System.out.println("Extracted Max = " + max1);
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        maxHeap.insert(8);
        maxHeap.insert(20);
        maxHeap.insert(10);
        maxHeap.insert(3);
        maxHeap.displayHeap();
        int max2 = maxHeap.extractMax();
        maxHeap.displayHeap();
        System.out.println("Extracted Max = " + max2);
    }
}
