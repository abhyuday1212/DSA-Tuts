package trees;

import java.util.ArrayList;

public class j011_jRootToLeaf {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(5);

        System.out.println(pathsHelper(rootNode, new ArrayList<>()));
    }


    public static ArrayList<ArrayList<Integer>> pathsHelper(TreeNode root, ArrayList<Integer> ds) {
        ArrayList<ArrayList<Integer>> baseAns = new ArrayList<>();

        if (root == null) {
            return baseAns;
        }

        //self work
        ds.add(root.data);

        if (root.left == null && root.right == null) {
            baseAns.add(new ArrayList<>(ds));
        } else {
            baseAns.addAll(pathsHelper(root.left, ds));
            baseAns.addAll(pathsHelper(root.right, ds));
        }

        ds.remove(ds.size() - 1);

        return baseAns;
    }
}
