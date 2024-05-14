//wap to find the factorial of a number

import java.util.Scanner;

class j19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, fact;

        System.out.println("Enter No. To find the factorial of a number : ");
        u = sc.nextInt();

        fact = 1;
        while (u > 0) {
            fact = fact * u;
            u--;
        }
        System.out.println("Factorial = " + fact);

        sc.close();

    }
}
