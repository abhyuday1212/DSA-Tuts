package RecursionQuests;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(80202));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        //Extract the last number
        int rem = n % 10;

        if (rem == 0) {
            // n/10-> use to remove one digit from the end.
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
}
