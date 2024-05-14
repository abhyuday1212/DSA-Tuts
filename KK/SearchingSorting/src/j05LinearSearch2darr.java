import java.util.*;

public class j05LinearSearch2darr {

    public static void main(String[] args) {
        int[][] inputArr = {
                {4, 2, 63, 0, 3},
                {5, 6, 7, 8, 98, 8, 9, 5, 6},
                {1, 2},
                {2, 332, 3}


        };
        int target = 2;
        int[] ans = findMin(inputArr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findMin(int[][] arr, int tar) {
        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == tar) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};

    }

}
