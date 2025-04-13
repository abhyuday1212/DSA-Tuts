package trees;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
        data = key;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
