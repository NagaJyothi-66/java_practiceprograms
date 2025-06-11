package jyothi;
import java.util.*;

public class SocialNetwork {

    // Adjacency list representation: person -> list of friends
    private Map<String, List<String>> network;

    // Constructor
    public SocialNetwork() {
        network = new HashMap<>();
    }

    // Method to add a person to the network
    public void addPerson(String name) {
        if (network.containsKey(name)) {
            System.out.println(name + " already exists in the network.");
        } else {
            network.put(name, new ArrayList<>());
            System.out.println(name + " added to the network.");
        }
    }

    // Method to add a friendship between two people
    public void addFriendship(String person1, String person2) {
        if (!network.containsKey(person1) || !network.containsKey(person2)) {
            System.out.println("Error: One or both persons do not exist in the network.");
            return;
        }

        // Prevent self-friendship
        if (person1.equals(person2)) {
            System.out.println("Error: Cannot add friendship with oneself.");
            return;
        }

        List<String> friendsOfPerson1 = network.get(person1);
        List<String> friendsOfPerson2 = network.get(person2);

        // Check if already friends
        if (friendsOfPerson1.contains(person2)) {
            System.out.println(person1 + " and " + person2 + " are already friends.");
            return;
        }

        // Add each other as friends
        friendsOfPerson1.add(person2);
        friendsOfPerson2.add(person1);

        System.out.println("Friendship added between " + person1 + " and " + person2 + ".");
    }

    // Method to display the entire network
    public void displayNetwork() {
        System.out.println("\n--- Social Network ---");
        for (String person : network.keySet()) {
            List<String> friends = network.get(person);
            System.out.println(person + " -> " + friends);
        }
    }

    // Method to get friends of a person
    public List<String> getFriends(String person) {
        if (!network.containsKey(person)) {
            System.out.println("Error: " + person + " does not exist in the network.");
            return Collections.emptyList();
        }
        return new ArrayList<>(network.get(person)); // Return a copy to avoid external modification
    }

    // Main method for testing
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        // Adding people
        sn.addPerson("Alice");
        sn.addPerson("Bob");
        sn.addPerson("Charlie");
        sn.addPerson("Diana");

        // Adding friendships
        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");
        sn.addFriendship("Bob", "Diana");

        // Display network
        sn.displayNetwork();

        // Get friends of Alice
        System.out.println("\nFriends of Alice: " + sn.getFriends("Alice"));

        // Edge cases
        sn.addPerson("Alice"); // Duplicate person
        sn.addFriendship("Alice", "Eve"); // Person not in network
        sn.addFriendship("Alice", "Alice"); // Self-friendship
    }
}