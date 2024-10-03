public class HeapSort {

    public void sort(int[] arr) {
        int n = arr.length;

        // Build Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted at index i
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Utility function to print the array
    private void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();

        // Test Case 1
        System.out.println("Test Case 1:");
        int[] arr1 = {5, 1, 12, 3, 9};
        heapSort.sort(arr1);
        heapSort.printArray(arr1); // Output: [1, 3, 5, 9, 12]

        // Test Case 2
        System.out.println("Test Case 2:");
        int[] arr2 = {20, 15, 8, 10};
        heapSort.sort(arr2);
        heapSort.printArray(arr2); // Output: [8, 10, 15, 20]
    }
}
