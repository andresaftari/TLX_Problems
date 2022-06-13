package tree;

public class BinaryTree {
    // Pada tree, Node yang pertama adalah root
    private Node root;

    // Pada saat tree dibuat, Node root harus null (tidak ada isinya)
    public BinaryTree() {
        this.root = null;
    }

    // Ini digunakan untuk case 4, cek kosong atau tidak
    public boolean isEmpty() {
        return root == null;
    }

    // Ini digunakan untuk case 1, insert data
    public void insert(Integer data) {
        root = insert(root, data);
    }

    // Ini adalah operasi insert data
    private Node insert(Node node, Integer data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }

    // Ini digunakan untuk case 3, cetak jumlah
    public int countNode() {
        return countNode(root);
    }

    // Ini adalah operasi cetak jumlah
    private int countNode(Node r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNode(r.getLeft());
            l += countNode(r.getRight());
            return l;
        }
    }

    public boolean search(Integer val) {
        return search(root, val);
    }

    private boolean search(Node root, Integer data) {
        if (root.getData().equals(data)) {
            return true;
        } else if (root.getLeft() != null) {
            return search(root.getLeft(), data);
        } else if (root.getRight() != null) {
            return search(root.getRight(), data);
        }

        return false;
    }

    // Ini untuk mencetak tree secara inorder
    public void inorder() {
        inorder(root);
    }

    // Ini operasi inorder
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node root) {
        if (root != null) {
            postorder(root.getLeft());
            System.out.print(root.getData() + " ");
            postorder(root.getRight());
        }
    }
}