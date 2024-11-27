package RecursionQuests;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(1234);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int remainder = n % 10; // this line is used for selecting last digit
        return remainder + sum(n / 10); // In recursion usually the recursive function calls handles the incr or decrement
    }
}
