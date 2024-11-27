package MathsForDSA;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 17;
        // correct for the base condition
        boolean ans = (n & (n - 1)) == 0;
        // If ans holds above condition that it is power of two


        System.out.println(ans);

    }
}
