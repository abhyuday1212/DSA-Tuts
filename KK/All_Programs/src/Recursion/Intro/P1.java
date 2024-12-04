package Recursion.Intro;

public class P1 {
    public static void main(String[] args) {
        int ans = fibbo(5);
        System.out.println(ans);

    }

    static int fibbo(int n){
        // base condition
        if(n<2){
            return n;
        }
// Linear Recursive relation
        return fibbo(n-1) + fibbo(n-2);
    }
}
