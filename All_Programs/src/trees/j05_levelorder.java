package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class j05_levelorder {

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Getting postorder traversal
        List<List<Integer>> result = levelorder(root);

        // Displaying the postorder traversal result
        System.out.print("level order Traversal:\n " + result);

    }

    public static int findMaxSize(List<List<Integer>> listOfLists) {
        if (listOfLists == null || listOfLists.isEmpty()) {
            return 0; // Or throw an exception, depending on your needs
        }

        int maxSize = 0;

        for (List<Integer> currentList : listOfLists) {
            int currentSize = currentList.size();
            maxSize = Math.max(maxSize, currentSize);
        }

        return maxSize;
    }


    public static List<List<Integer>> levelorder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return ans;

//        q.add()  // we can also use this, but this return return exception in case of failwure, whereas the other one just return false
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new LinkedList<Integer>();

            for (int i = 0; i < size; i++) {
                // poll the node at once
                // Poll the node once
                TreeNode node = q.poll();

                // Add the current node's value
                level.add(node.data);

                // Add left and right children to the queue
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            ans.add(level);
        }

        return ans;
    }
}
