
//Check a givn number is odd or even

import java.util.Scanner;

public class j8 {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number is a Even Number");
        } else {
            System.out.println("The Number is odd number");
        }
        sc.close();
    }
}
