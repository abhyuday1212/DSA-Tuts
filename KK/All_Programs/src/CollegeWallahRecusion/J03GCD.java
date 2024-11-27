package CollegeWallahRecusion;

import java.util.Scanner;

public class J03GCD {


    static int iGCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        return y;
    }

    static int gcd(int x, int y){
        if (y == 0){
            return x;
        }

        return gcd(y,x%y);
    }
    public static void main(String[] args) {

        System.out.println("Enter X");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        System.out.println("Enter Y");
        int y = sc.nextInt();

        System.out.println(iGCD(x,y));
        System.out.println(gcd(x,y));
    }

}
