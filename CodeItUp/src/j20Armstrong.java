public class j20Armstrong {
    public static void main(String[] args) {
        boolean ans = ArmstrongNumber(111);
        System.out.println(ans);
    }

    static boolean ArmstrongNumber(int x) {
        int originalNum = x;
        int sum = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
            x = x / 10;
        }

        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
