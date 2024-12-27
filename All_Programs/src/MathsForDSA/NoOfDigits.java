package MathsForDSA;

public class NoOfDigits {
    public static void main(String[] args) {

        int num = 5598;
        int base = 10;

        int numOfDigits = (int) ((Math.log(num)) / (Math.log(base)) + 1);
        System.out.println(numOfDigits);
    }
}
