package Recursion.backtracking;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(pathFinder(3,3));
    }

    static int pathFinder(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = pathFinder(r - 1, c);
        int right = pathFinder(r, c - 1);



        return left + right;
    }
}
