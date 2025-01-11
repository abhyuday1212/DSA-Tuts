package Arrays.TwoDArrays;

import java.util.Scanner;

public class Intro2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rows:");
        int n = sc.nextInt(); //row
        System.out.println("Enter the number of Columns:");
        int m = sc.nextInt(); // coulumns

        int[][] arr = new int[n][m];

        //get the elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the element at arr[" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }

        //print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
