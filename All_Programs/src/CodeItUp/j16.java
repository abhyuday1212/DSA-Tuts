package CodeItUp;

import java.util.Scanner;

class j16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, pro = 1;
        System.out.println("Enter a Number : ");
        u = sc.nextInt();
        while (u > 0) {
            pro = pro * (u % 10); // Use (u % 10) to extract the last digit
            u = u / 10;
        }

        System.out.println("The product of digits of the given number is : " + pro);
        sc.close();
    }
}
