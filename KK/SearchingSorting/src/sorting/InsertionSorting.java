package sorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] marry = {1, 4, 2, 6, 14, 9};
        int[] ans = InsertionSort(marry);
        System.out.println(Arrays.toString(ans));
    }

    static int[] InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            // think it of as till where you want to compare, starting se se dusra element will be the place till which you wanted it to be compared
            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
