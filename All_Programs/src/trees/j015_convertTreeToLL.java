package trees;

import java.util.ArrayList;
import java.util.List;

public class j015_convertTreeToLL {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(5);
        rootNode.left.left = new TreeNode(3);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(6);

        flatten(rootNode);
    }

    private  static TreeNode prev = null;

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

}
