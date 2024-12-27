package CodeItUp;

import java.util.Scanner;

// Program to print 1-10
public class j11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, i, sum;
        System.out.println("Enter The Number till which you want to print the sum ");
        u = sc.nextInt();
        sum = 0;
        i = 1;
        while (i <= u) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
