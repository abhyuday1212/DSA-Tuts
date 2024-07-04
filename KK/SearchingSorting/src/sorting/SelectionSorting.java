package sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] marry = {1, 4, 2, 6, 14, 9};
        int[] ans = SelectionSort(marry);
        System.out.println(Arrays.toString(ans));
    }

    static int[] SelectionSort(int[] arr) {
        // we have to select the minimum or maximum element and bring that particular element to the start or end respectively.
        int n = arr.length;
        int min = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                // find min
                if (arr[j] < arr[min]) {
                    //swap
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
