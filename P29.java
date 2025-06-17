// WAP program to Generate a Binary search tree from given multiple node Value. 
// Perform insert and delete operation on BST

// INSERT
// Start from the root.
// If the tree is empty→create a new node as root.
// Else,compare the value:
// If value<current→go to left subtree.
// If value>current→go to right subtree.
// Repeat until a null position is found and insert the node.

// DELETE 
// There are 3 cases:
// Node not found→return root.
// Node is leaf→return null.
// Node has one or two children:
// If one child,return that child.
// If two children,replace with inorder successor(min value in right subtree),then delete that successor.

public class P29 {
    public static void main(String[] args) {
        int values[] = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        root = delete(root, 30);
        System.out.print("Inorder after deletion: ");
        inorder(root);
    }

    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

    static Node delete(Node root, int key) {
        if (root == null)
            return null;
        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // case 1
            if (root.left == null && root.right == null)
                return null;
            // case 2
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // case 3
            root.data = minValue(root.right);// replace
            root.right = delete(root.right, root.data);// delete min value of right subtree
        }

        return root;
    }

    static int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
        }
        return minValue;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
