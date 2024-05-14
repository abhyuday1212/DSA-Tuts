import java.util.Scanner;

// Program to print 1-10
public class j10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, i;
        System.out.println("Enter The Number till which you want to print the number");
        u = sc.nextInt();
        i = 1;
        while (i <= u) {

            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
