package jyothi;

import java.util.Scanner;

public class LinearSearchArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
