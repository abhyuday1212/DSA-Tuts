package trees;

public class j014_countNode {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(5);
        rootNode.right.left = new TreeNode(6);
        rootNode.right.right = new TreeNode(7);

        System.out.println(countNodes(rootNode));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHt = findLeftHt(root.left);
        int rightHt = findRightHt(root.right);

        if (leftHt == rightHt) return ((2 ^ leftHt) - 1);
        return recursivelyTraverse(root);
    }

    public static int findLeftHt(TreeNode root) {
        int count = 0;
        TreeNode node = root;

        while (node.left != null) {
            count++;
            node = node.left;
        }

        return count;
    }

    public static int findRightHt(TreeNode root) {
        int count = 0;
        TreeNode node = root;

        while (node.right != null) {
            count++;
            node = node.right;
        }

        return count;
    }

    // Brut:
    // Tc: O(n)
    // Sc: O(n)
    public static int recursivelyTraverse(TreeNode root) {
        //inorder traversal
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
