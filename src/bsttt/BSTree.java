package bsttt;

public class BSTree {
    private static Node root = null;

    public static void main(String[] args) {
        insert(23);
        insert(10);
        insert(5);
        insert(8);
        insert(11);
        insert(4);
        insert(7);

        System.out.println("Post Order: ");
        postorder(root);
        System.out.println("\nPre Order: ");
        preorder(root);
        System.out.println("\nIn Order: ");
        inorder(root);
    }

    private static void insert(int data) {
        root = setNode(root, data);
    }

    private static Node setNode(Node node, int newData) {
        if (node == null) {
            node = new Node(newData);
            return node;
        }
        else {
            if (newData < node.data) node.left = setNode(node.left, newData);
            else if (newData > node.data) node.right = setNode(node.right, newData);
        }

        return node;
    }

    // Post Order (L -> R -> Root)
    private static void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Pre Order (Root -> L -> R)
    private static void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // In Order (L -> Root -> R)
    private static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        left = right = null;
        this.data = data;
    }
}
