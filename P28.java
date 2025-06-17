// Print a Leaf Nodes in Binary search tree.

// Start from the root.

// Traverse left and right recursively.

// If a node’s left == null and right == null, it is a leaf → print it.

public class P28 {
    public static void main(String[] args) {
        int values[] = { 50, 30, 70, 20, 40, 80 };
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        System.out.println("Leaf Node : ");
        printLeafNode(root);
    }

    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static void printLeafNode(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            System.out.println(root.data + " ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
    }

}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}