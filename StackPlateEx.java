package jyothi;

import java.util.Stack;

public class StackPlateEx{
    public static void main(String[] args) {
        Stack<Integer> plateStack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            plateStack.push(i);
            System.out.println("Plate " + i + " cleaned and added to stack.");
        }

        System.out.println("\nTotal plates stacked: " + plateStack.size());
        while (!plateStack.isEmpty()) {
            int plate = plateStack.pop();
            System.out.println("Plate " + plate + " taken for eating.");
            System.out.println("Plates left in stack: " + plateStack.size());
        }
    }
}