package Recursion.CollegeWallahRecusion;

import java.util.Scanner;

public class J02SeriesSum {

    static int seriesSum(int n) {
        if (n == 0) {
            return 0;
        }

        // Subtask is to keep adding new sum into the existing one
        return n + seriesSum(n - 1);
    }

    static int signMixSumSeries(int n) {
        // 1 - 2 + 3 - 4 + 5
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return -n + signMixSumSeries(n - 1);
        }

        return signMixSumSeries(n - 1) + n;
    }

    public static void main(String[] args) {
        //Take the users input
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(seriesSum(n));
        System.out.println(signMixSumSeries(n));
    }
}
