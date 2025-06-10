
package jyothi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SocialCricleDFS {
	public Map<String ,List<String>> graph = new HashMap<>();
	public void addConnection(String person1,String person2) {
		graph.putIfAbsent(person1,new ArrayList<>());
		graph.putIfAbsent(person2,new ArrayList<>());
		graph.get(person1).add(person2);
		graph.get(person2).add(person1);
	}
	public List<String> findSocialCircle(String person){
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();

        dfsRecursive(person, visited, result);

        return result;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> result) {
        if (visited.contains(person)) return;

        visited.add(person);
        result.add(person);

        for (String neighbor : graph.getOrDefault(person, new ArrayList<>())) {
            dfsRecursive(neighbor, visited, result);
        }
    }

    // Iterative DFS
    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();

            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);

                for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return result;
    }

    // Test / Main Method
    public static void main(String[] args) {
        SocialCricleDFS network = new SocialCricleDFS();

        // Build sample social network
        network.addConnection("Alice", "Bob");
        network.addConnection("Bob", "Charlie");
        network.addConnection("David", "Eve");
        network.addConnection("Frank", "Grace");

        // Testing Recursive DFS
        System.out.println("Recursive Social Circle of Bob: " + network.findSocialCircle("Bob"));
        System.out.println("Recursive Social Circle of David: " + network.findSocialCircle("David"));

        // Testing Iterative DFS
        System.out.println("Iterative Social Circle of Bob: " + network.findSocialCircleIterative("Bob"));
        System.out.println("Iterative Social Circle of David: " + network.findSocialCircleIterative("David"));
    }
}