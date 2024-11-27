package Recursion;

public class P3 {
    public static void main(String[] args) {
        //calling fibonacci series with the fibonacci formula
        System.out.println(fibonacciFormula(2));
    }

    static int fibonacciFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5))/2),n)/ Math.sqrt(5));
    }
}
