package CodeItUp;
//wap to build calculator
import java.util.Scanner;

public class j9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b,c;
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("Listn Of Operation :");
        System.out.println("Enter 1 for addition:");
        System.out.println("Enter 2 for subtraction:");
        System.out.println("Enter 3 for multiplication:");
        System.out.println("Enter 4 for division:");
        c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println(a + " / " + b + " =   " + (a / b));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();

    }
}
