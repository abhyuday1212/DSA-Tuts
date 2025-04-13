package trees;

public class j08_diameterBt {
    public static void main(String[] args) {
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(6);

        int maxHt = 0;
        traverseAtEveryNode(root2, maxHt);
        System.out.println(maxHt);
    }

    public static void traverseAtEveryNode(TreeNode root, int maxHt) {
        if (root == null) {
            return;
        }

        // find ht at every node
        maxHt = Math.max(findHt(root), maxHt);

        traverseAtEveryNode(root.left, maxHt);
        traverseAtEveryNode(root.right, maxHt);
    }

    public static int findHt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findHt(root.left);
        int right = findHt(root.right);

        return 1 + Math.max(left, right);
    }
}
