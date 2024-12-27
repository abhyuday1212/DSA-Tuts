package CodeItUp;//Sum of a digit of a given number

import java.util.Scanner;
class j {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int u, sum = 0;
 System.out.println("Enter a number: ");
 u = sc.nextInt();

 while (u > 0) {
     sum = sum + u % 10;
     u = u / 10;
 }
System.out.println("The sum of the number is : "+sum);



sc.close();

    }
}
