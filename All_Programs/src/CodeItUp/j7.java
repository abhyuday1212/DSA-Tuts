package CodeItUp;

import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greaer than " + b + " and " + c);
        }
        else if (b > a && b > c) {
            System.out.println(b + " is greaer than " + a + " and " + c);
        }
        else{
            System.out.println(c + " is greaer than " + a + " and " + b);
        }
        sc.close();
    }
}
