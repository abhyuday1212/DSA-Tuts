package trees;

import java.util.ArrayList;
import java.util.Arrays;

public class j012_Lcs {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(5);

        ArrayList<Integer> path1 = new ArrayList<>();
        boolean found1 = findPath(rootNode, path1, new TreeNode(3));
        System.out.println(path1);

        ArrayList<Integer> path2 = new ArrayList<>();
        boolean found2 = findPath(rootNode, path2, new TreeNode(4));
        System.out.println(path2);

        System.out.println(findLCS(path1, path2));


    }

    public static int findLCS(ArrayList<Integer> path1, ArrayList<Integer> path2) {
        int lowestSize = path1.size() > path2.size() ? path2.size() : path1.size();


        int index = 0;
        int firstOrCommonIndex = path1.size() > path2.size() ? path2.getFirst() : path1.getFirst();

        while (index < lowestSize) {
            if (path1.get(index) == path2.get(index)) {
                firstOrCommonIndex = path1.get(index);
            }
            index++;
        }

        return firstOrCommonIndex;
    }

    public static boolean findPath(TreeNode root, ArrayList<Integer> ds, TreeNode key) {
        if (root == null) {
            return false;
        }

        ds.add(root.data);

        if (root.data == key.data) {
            return true; // Path found
        }

        if (findPath(root.left, ds, key) || findPath(root.right, ds, key)) {
            return true;
        }

        ds.remove(ds.size() - 1);

        return false;
    }
}
