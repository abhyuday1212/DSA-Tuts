package trees;

import java.util.ArrayList;
import java.util.List;

public class j04_postorder {
    static void postorder(TreeNode root, List<Integer> arr) {
        // base condition
        if (root == null) {
            return;
        }

        postorder(root.left, arr);

        postorder(root.right, arr);

        // Push the current TreeNode's value into the list
        arr.add(root.data);
    }

    // Function to initiate postorder traversal
    // and return the resulting list
    static List<Integer> initpostorder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        postorder(root, arr);

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

        // Getting postorder traversal
        List<Integer> result = initpostorder(root);

        // Displaying the postorder traversal result
        System.out.print("postorder Traversal: ");
        // Output each value in the
        // postorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
