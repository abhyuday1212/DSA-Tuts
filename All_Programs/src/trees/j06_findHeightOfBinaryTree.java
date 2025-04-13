package trees;

public class j06_findHeightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode rootTreeNode = new TreeNode(3);
        rootTreeNode.left = new TreeNode(9);
        rootTreeNode.right = new TreeNode(20);
        rootTreeNode.right.left = new TreeNode(15);
        rootTreeNode.right.right = new TreeNode(7);
        System.out.println(findMaxHt(rootTreeNode));
    }

    public static int findMaxHt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findMaxHt(root.left);
        int right = findMaxHt(root.right);

        return 1 + Math.max(left, right);
    }


}
