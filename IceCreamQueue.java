package jyothi;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamQueue {
    public static void main(String[] args) {
        // Step 1: Create a queue of kids
        Queue<String> iceCreamQueue = new LinkedList<>();

        // Step 2: Add 5 kids to the queue
        iceCreamQueue.add("Alice");
        iceCreamQueue.add("Bob");
        iceCreamQueue.add("Charlie");
        iceCreamQueue.add("Daisy");
        iceCreamQueue.add("Ethan");

        // Step 3: Show the first kid in the queue
        System.out.println("First kid in queue: " + iceCreamQueue.peek());

        // Step 4: Remove the first kid after serving
        String servedKid = iceCreamQueue.poll();
        System.out.println("Served: " + servedKid);

        // Step 5: Add a new kid at the end
        iceCreamQueue.add("Fiona");

        // Step 6: Show the updated queue
        System.out.println("\nUpdated Queue:");
        for (String kid : iceCreamQueue) {
            System.out.println(kid);
        }
    }
}
