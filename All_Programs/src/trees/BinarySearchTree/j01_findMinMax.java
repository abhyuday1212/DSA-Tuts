package trees.BinarySearchTree;


import trees.TreeNode;

public class j01_findMinMax {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(9);
        rootNode.left = new TreeNode(6);
        rootNode.right = new TreeNode(11);
        rootNode.left.left = new TreeNode(5);
        rootNode.left.right = new TreeNode(8);
        rootNode.left.left.left = new TreeNode(1);

        System.out.println(minValue(rootNode));
    }

    public static int minValue(TreeNode root) {
        // The Left Most element is the minimum valued
        int minAns = root.data;

        while(root != null){
            if(minAns > root.data){
                minAns = root.data;
            }
            root = root.left;
        }

        return minAns;
    }
}
