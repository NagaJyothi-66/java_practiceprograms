package jyothi;

import java.util.*;

public class SimpleBFSExample {
    public static void main(String[] args) {
        // Create the graph
        Map<String, List<String>> zooMap = new HashMap<>();

        // Define connections
        zooMap.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        zooMap.put("Reptile House", Arrays.asList("Snake Pit"));
        zooMap.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        zooMap.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));

        // Other zones have no further connections
        zooMap.put("Snake Pit", Collections.emptyList());
        zooMap.put("Parrot Pavilion", Collections.emptyList());
        zooMap.put("Lion Den", Collections.emptyList());
        zooMap.put("Elephant Enclosure", Collections.emptyList());

        // Print the structure
        for (String zone : zooMap.keySet()) {
            System.out.println(zone + " connects to: " + zooMap.get(zone));
        }
    }
}