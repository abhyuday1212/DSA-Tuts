package MathsForDSA;

public class OddEven {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isOdd(n));
    }

    static Boolean isOdd(int n){
        // If Odd Return True, If even Return false
        return (n & 1) == 1;
    }
}
