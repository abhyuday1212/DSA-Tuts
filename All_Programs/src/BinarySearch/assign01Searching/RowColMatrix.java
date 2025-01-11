package assign01Searching;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] ipArr = {
                {1,2},
                {11, 12,14,15},
                {16, 19, 25}
        };
        int[] ans = search(ipArr, 16);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
