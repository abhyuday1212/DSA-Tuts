package CodeItUp;

import java.util.Scanner;

//reverse of a given number
class j12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,rev=0;
        System.out.println("Enter a number: ");
        i = sc.nextInt();

        while (i > 0) {
            rev = (rev* 10) + i% 10;
            i = i / 10;

        }
        System.out.println("Reverse of a number : "+rev);
        sc.close();


    }
}
