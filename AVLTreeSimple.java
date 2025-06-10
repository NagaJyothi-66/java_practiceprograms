package jyothi;

import jyothi.AVLTreeSimple;
import jyothi.AVLTreeSimple.Node;

public class AVLTreeSimple {
    class Node {
        int Key;
        int height;
        Node left, right;

        public Node(int value) {
            Key = value;
            height = 1;
        }
    }

    Node root;

    int height(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    int getBalance(Node n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right; // fixed here
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.Key)
            node.left = insert(node.left, key);
        else if (key > node.Key)
            node.right = insert(node.right, key);
        else
            return node; // duplicate keys not allowed

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor
        int balance = getBalance(node);

        // If node is unbalanced, there are 4 cases

        // Left Left Case
        if (balance > 1 && key < node.left.Key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.Key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.Key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key < node.right.Key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the (unchanged) node pointer
        return node;
    }
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.Key + " ");
            inorder(node.right);
        }
    }
    public void insert(int key) {
        root = insert(root, key);
    }

    public static void main(String[] args) {
        AVLTreeSimple tree = new AVLTreeSimple();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Inorder traversal of AVL tree is:");
        tree.inorder(tree.root);
    }
    
}
