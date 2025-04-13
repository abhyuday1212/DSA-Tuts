package trees;

public class j07_isBalancedBt {
    public static void main(String[] args) {
        // true scenario example
//        TreeNode root1 = new TreeNode(3);
//        root1.left = new TreeNode(9);
//        root1.right = new TreeNode(20);
//        root1.right.left = new TreeNode(15);
//        root1.right.right = new TreeNode(7);

        // false scenarion example
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(6);

        boolean ans = findHt(root2) == -1 ? false : true;
        System.out.println(ans);
    }

    public static int findHt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findHt(root.left);
        if (left == -1) {
            return -1;
        }

        int right = findHt(root.right);
        if (right == -1) {
            return -1;
        }

        // condition for balanced BT is:
        // (Math.abs(leftHt - rightHt) <= 1)
        if (Math.abs(left - right) > 1) {
            return -1; // Tree is unbalanced
        }

        return 1 + Math.max(left, right);
    }
}
