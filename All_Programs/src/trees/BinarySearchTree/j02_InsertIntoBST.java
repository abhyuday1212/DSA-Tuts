package trees.BinarySearchTree;

import trees.TreeNode;

public class j02_InsertIntoBST {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(4);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(7);
        rootNode.left.left = new TreeNode(1);
        rootNode.left.right = new TreeNode(3);

        TreeNode ans = insertIntoBST(rootNode, 5);
        System.out.println(ans);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {

        while (root != null) {
            if(val < root.data && root.left == null){
                root.left = new TreeNode(val);
                break;
            }

            if( val > root.data && root.right == null){
                root.right = new TreeNode(val);
                break;
            }


            System.out.print(root.data);
            if (root.data < val) {
                // move right
                root = root.right;
            } else {
                root = root.left;
            }


        }

        return root;
    }
}
