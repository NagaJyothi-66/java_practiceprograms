package jyothi;

import java.util.Stack;

public class UndoFeatureDemo {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack<>();

        // Push 3 actions
        actionStack.push("Write");
        actionStack.push("Delete");
        actionStack.push("Insert");

        // Show the last action using peek
        System.out.println("Last action (peek): " + actionStack.peek());

        // Undo 2 actions (pop)
        System.out.println("Undo action: " + actionStack.pop());
        System.out.println("Undo action: " + actionStack.pop());

        // Show what's left in the stack
        System.out.println("Actions left in stack: " + actionStack);
    }
}