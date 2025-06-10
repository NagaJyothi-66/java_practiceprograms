package jyothi;

import jyothi.Node;

class Node {
    String name;
    Node left, right;

    Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        // 1. Create tree: Mom -> Dad (left), You (right)
        Node root = new Node("Mom");
        root.left = new Node("Dad");
        root.right = new Node("You");

        // 2. Print root
        System.out.println("Root: " + root.name);

        // 3. Print left and right child of root
        System.out.println("Left child of root: " + root.left.name);
        System.out.println("Right child of root: " + root.right.name);

        // 4. Go from top to bottom
        System.out.println("Top to bottom:");
        System.out.println(root.name);
        if (root.left != null) System.out.println(root.left.name);
        if (root.right != null) System.out.println(root.right.name);

        // 5. Count total nodes
        System.out.println("Total nodes: " + countNodes(root));

        // 6. Count leaf nodes
        System.out.println("Leaf nodes: " + countLeaves(root));

        // 7. In-order traversal
        System.out.println("In-order traversal:");
        inOrder(root);
        System.out.println();

        // 8. Mirror the tree
        mirror(root);
        System.out.println("Tree mirrored. New in-order traversal:");
        inOrder(root);
        System.out.println();

        // 9. Print all paths from root to leaves
        System.out.println("Paths from root to leaves:");
        printPaths(root, "");

        // 10. Check if tree is balanced
        System.out.println("Is the tree balanced? " + isBalanced(root));
    }

    // Count all nodes
    public static int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Count leaf nodes
    public static int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // In-order traversal
    public static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.name + " ");
            inOrder(node.right);
        }
    }

    // Mirror the tree
    public static void mirror(Node node) {
        if (node != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            mirror(node.left);
            mirror(node.right);
        }
    }

    // Print all paths from root to leaves
    public static void printPaths(Node node, String path) {
        if (node == null) return;

        path += node.name;

        if (node.left == null && node.right == null) {
            System.out.println(path);
        } else {
            printPaths(node.left, path + " -> ");
            printPaths(node.right, path + " -> ");
        }
    }

    // Check if tree is balanced
    public static boolean isBalanced(Node node) {
        return checkHeight(node) != -1;
    }

    private static int checkHeight(Node node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        int right = checkHeight(node.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }
}
