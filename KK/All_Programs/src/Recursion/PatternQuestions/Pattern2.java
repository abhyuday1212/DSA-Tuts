package Recursion.PatternQuestions;

import java.util.Arrays;

public class Pattern2 {

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 6, 7, 5, 90, 70};
        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c]  > arr[c + 1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubblesort(arr,r, c+1);

        } else {
            bubblesort(arr,r - 1, 0);
        }
    }
}
