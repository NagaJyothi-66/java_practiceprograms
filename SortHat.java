package jyothi;
public class SortHat {
    public static void main(String[] args) {
        String[] students = {"Harry", "Draco", "Hermione", "Ron", "Neville"};
        
        int n = students.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent strings
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap
                    String temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps, array is sorted
            if (!swapped) break;
        }

        // Print sorted names
        System.out.println("Sorted student names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
