package Recursion.RecursionQuests;

public class ReverseANumber {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    static void rev2(int n) {
        if (n == 0) {
            return;
        }

        int remainder = n % 10;

        System.out.print(remainder);
        rev2(n / 10);
        return;
    }

    static int rev3(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        rev1(4358);
        System.out.println(sum);

//        rev2(9283);

//        System.out.println(rev3(3546));
    }

}
