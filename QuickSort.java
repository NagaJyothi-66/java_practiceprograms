package jyothi;

public class QuickSort {
    // QuickSort algorithm
    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Pointer for the smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Method to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};
        System.out.println("Before Sorting:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("After Sorting:");
        printArray(numbers);
    }
}