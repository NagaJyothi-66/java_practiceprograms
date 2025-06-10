package jyothi;

import java.util.*;

public class SimpleDFS {

    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    // Connects two rooms (bidirectional)
    public void addRoom(String room, String connectedRoom) {
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
    }

    // Depth-First Search
    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for (String neighbor : homeMap.getOrDefault(currentRoom, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    // Main function
    public static void main(String[] args) {
        SimpleDFS house = new SimpleDFS();

        // Add connections between rooms
        house.addRoom("LivingRoom", "Kitchen");
        house.addRoom("Kitchen", "Bathroom");
        house.addRoom("LivingRoom", "Bedroom");

        // Perform DFS from the LivingRoom
        System.out.println("DFS Traversal Starting from LivingRoom:");
        house.dfs("LivingRoom");
    }
}
