package jyothi;
import java.util.Scanner;

public class BinarySearchRoot {
    public static int integerSqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Square root of negative number is not supported.");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int low = 0, high = n, result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n / mid) {  // Prevent overflow
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        int number = scanner.nextInt();
        int sqrt = integerSqrt(number);
        System.out.println("The integer part of the square root of " + number + " is: " + sqrt);
        scanner.close();
    }
}