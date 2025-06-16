package jyothi;
import java.util.Scanner;

public class BinarySearchArray{
    // Binary search function
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target)
                return mid; // Element found
            else if (array[mid] < target)
                left = mid + 1; // Search in the right half
            else
                right = mid - 1; // Search in the left half
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array (must be sorted)
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Call binary search
        int result = binarySearch(arr, key);

        // Output result
        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + result);
        
        scanner.close();
    }
}
