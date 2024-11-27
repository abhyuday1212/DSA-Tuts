package MathsForDSA;

public class isPrime {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPrimeFn(n));

    }

    private static boolean isPrimeFn(int n) {
        if (n < 1 ){
            return false;
        }

        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if ( n % i == 0){
                return false;
            }
        }

        return true;
    }
}
