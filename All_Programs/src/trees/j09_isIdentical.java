package trees;

public class j09_isIdentical {
    public static void main(String[] args) {

    }

    public static boolean isIdentical(TreeNode p, TreeNode q) {
        //base condition
        if (p == null || q == null) {
            return p == q;
        }

        return p.data == q.data && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }

}
