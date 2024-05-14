//pgm to find prime number or not
import java.util.Scanner;

class j17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, i, count = 0;
        System.out.println("Enter a number: ");
        u = sc.nextInt();
        i = 1;
        while (i <= u) {
            if (u % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            System.out.println("It's a Prime number");
        } else {
            System.out.println("It's not a Prime number");
        }

        sc.close();
    }
}
