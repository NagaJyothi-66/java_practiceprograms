package jyothi;

public class SortHatNumber{
    public static void main(String[] args) {
        int[] numbers = {42, 23, 4, 16, 8, 15};

        int n = numbers.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent numbers
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps, array is sorted
            if (!swapped) break;
        }

        // Print sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}