import java.util.*;

public class j06Max {
    public static void main(String[] args) {
        int[][] ipArr = {
                {21, 3, 2, 5, 7, 8},
                {11, 23, 54, 53},
                {31, 32, 5555555},
                {53}
        };
        System.out.println(max(ipArr));
    }

    static int max(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxVal) {
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }
}
