package trees;

import java.util.ArrayList;
import java.util.List;

public class j03_inorder {
    static void preorder(TreeNode root, List<Integer> arr) {
        // base condition
        if (root == null) {
            return;
        }

        preorder(root.left, arr);
        // Push the current TreeNode's value into the list
        arr.add(root.data);

        preorder(root.right, arr);
    }

    // Function to initiate preorder traversal
    // and return the resulting list
    static List<Integer> initPreOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        preorder(root, arr);

        return arr;
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Getting preorder traversal
        List<Integer> result = initPreOrder(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
