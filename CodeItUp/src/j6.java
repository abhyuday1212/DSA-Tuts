import java.util.Scanner;

class j6 {
    public static void main(String[] args) {
        // Write a program to find max between two numbers

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        System.out.println("Enter b number");
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }

        sc.close();
    }
}
