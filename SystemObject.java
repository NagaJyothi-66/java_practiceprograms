package jyothi;

import java.util.TreeSet;
import java.util.*;

public class SystemObject {
    public static void main(String[] args) {
        TreeSet<String> products = new TreeSet<>();
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("CPU");
        products.add("Webcam");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product name to search: ");
        String searchProduct = scanner.nextLine();

        if (products.contains(searchProduct)) {
            System.out.println(searchProduct + " is available.");
        } else {
            System.out.println(searchProduct + " is not available.");
        }

        scanner.close();
    }
}
