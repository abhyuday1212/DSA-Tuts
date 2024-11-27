package MathsForDSA;

public class SetBits {
    public static void main(String[] args) {
        int n =  5;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBitFn(n));
    }

    private static int setBitFn(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n - (n & -n);

        }
        return count;
    }
}
