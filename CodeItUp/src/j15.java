//wap to check weather a number is palindrome or not

import java.util.Scanner;

class j15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, rev = 0, key;
        System.out.println("Enter a Number : ");
        u = sc.nextInt();
        key = u;
        while (u > 0) {
            rev = rev * 10 + u % 10;
            u = u / 10;
        }
        if (key == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();

    }
}
