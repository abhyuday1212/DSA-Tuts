
import java.util.Scanner;

class j5 {
    public static void main(String args[]) {
        int len, br, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        len = sc.nextInt();
        System.out.println("Enter Breadth : ");
        br = sc.nextInt();
        area = len * br;
        System.out.println("Area of Rectangle = " + area);
        sc.close();

    }
}