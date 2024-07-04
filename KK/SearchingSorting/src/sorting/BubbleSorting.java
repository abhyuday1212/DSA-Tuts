package sorting;
// largest element from the given array will come at last in each iteration,

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] marry = {1, 4, 2, 6, 14, 9};
        int[] ans = BubbleSort(marry);
        System.out.println(Arrays.toString(ans));
    }

    static int[] BubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap
                    swapped = true;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                /*
                After completing the inner loop (one pass through the array), the algorithm checks if swapped is still false. If swapped is false, it means that no elements were swapped during this pass, indicating that the array is already sorted. Therefore, the algorithm can terminate early by breaking out of the outer loop.
                */
            }
            if (!swapped) {
                break;
            }
        }
        return arr;

    }
}
