import java.util.Scanner;

class j18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u, i, j, count;
        System.out.println("Enter a range: ");
        u = sc.nextInt();

        for (i = 1; i <= u; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
