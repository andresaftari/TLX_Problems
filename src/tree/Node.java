package tree;

// Ini merupakan Node atau object di Tree
public class Node {
    // Node memiliki leaf kiri (left) dan kanan (right)
    Node left, right;
    // Node juga memiliki data berupa Integer
    Integer data;

    public Node(Integer item) {
        this.left = this.right = null;
        this.data = item;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Integer getData() {
        return data;
    }
}
