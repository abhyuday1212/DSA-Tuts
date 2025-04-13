package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class j10_zigzag {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(3);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(2);
        rootNode.left.left = new TreeNode(5);
        rootNode.left.right = new TreeNode(4);
        rootNode.left.left.left = new TreeNode(7);
        rootNode.left.left.right = new TreeNode(6);
        System.out.println(zigzagTraversal(rootNode));
    }

    public static List<List<Integer>> zigzagTraversal(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        boolean leftToRight = true;

        if (root == null) return ans;

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sublevel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll(); //similar to q.peek()
                // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.

                if (leftToRight) {
//                    assert node != null;
                    sublevel.addFirst(node.data);
                } else {
                    sublevel.addFirst(node.data);
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            leftToRight = !leftToRight;
            ans.add(sublevel);
        }


        return ans;

    }
}
