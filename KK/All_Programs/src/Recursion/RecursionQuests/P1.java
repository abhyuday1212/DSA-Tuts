package Recursion.RecursionQuests;

public class P1 {
    public static void main(String[] args) {
        int num = 5;
        fun(num);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
//    This will print the 5,4,3,2,1

    static void funRev(int n) {
        if (n == 1) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

}
