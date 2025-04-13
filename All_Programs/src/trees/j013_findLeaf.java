package trees;

public class j013_findLeaf {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(5);

        System.out.println(findLeaves(rootNode, 0));
    }

    public static int findLeaves(TreeNode root, int count) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            count += 1;
        }else {
            int leftCount = findLeaves(root.left, count);
            int rightCount = findLeaves(root.right, count);
            count = leftCount + rightCount;
        }


        return count;
    }
}
