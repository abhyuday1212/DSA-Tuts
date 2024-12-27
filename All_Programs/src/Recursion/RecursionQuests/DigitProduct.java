package Recursion.RecursionQuests;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(215);
        System.out.println(ans);
    }

    static int prod(int n) {
        if (n % 10 == n) {
            // Dividing the single digit number will give the number itsef
            return n;
        }
        int remainder = n % 10;  //this line will give the last digit
        return remainder * prod(n / 10);
    }
}
