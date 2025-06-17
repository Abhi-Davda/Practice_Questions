// WAP program to perform inorder, preorder and postorder traversal in Binary search tree.

public class P30 {
    public static void main(String[] args) {
        int values[] = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        System.out.print("Preorder: ");
        preorder(root);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.print("Postorder: ");
        postorder(root);

    }

    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
