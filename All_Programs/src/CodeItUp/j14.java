package CodeItUp;//wap to find Sum of even and product of odd digits

import java.util.Scanner;

class j14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u,p, i = 0, even = 0, odd = 1;
        System.out.println("Enter a number Even/Odd: ");
        u = sc.nextInt();
        System.out.println("If you Entered Even Num. press 1:\nIf you Entered Odd Num. press 2 : ");
        p = sc.nextInt();
        switch (p) {

            case 1:
                while (i <= u) {

                    if (u % 2 == 0) {
                        even = even + 2;
                    }
                    i++;

                }
                System.out.println("The sum of the even number is : " + even);
                 break;
            case 2:
                while (i <= u) {

                    if (u % 2 != 0) {
                        odd = odd * i;
                    }
                    i++;
                }
               
                System.out.println("The product of the odd number is : " + odd);
                break;
        }
        sc.close();
    }
}