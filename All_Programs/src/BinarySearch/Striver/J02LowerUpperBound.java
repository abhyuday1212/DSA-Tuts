package BinarySearch.Striver;

import java.util.Arrays;

public class J02LowerUpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9,11,12};
        int n = arr.length;
        System.out.println(Arrays.toString((getlowerBoundAndupperBound(arr, n, 6))));
    }

    public static int[] getlowerBoundAndupperBound(int[] a, int n, int x) {
        int lowerBound = lowerBoundOfArr(a,n, x);
        int upperBound = upperBoundOfArr(a,n, x);

        return new int[]{lowerBound, upperBound};
    }

    // lowerBound
    public static int lowerBoundOfArr(int[] arr,int n, int x) {
        int start = 0;
        int end = n - 1;

        if (x < arr[0]) {
            return -1; // No lowerBound exists
        }

        int lowerBound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                // Possible lowerBound value
                lowerBound = arr[mid];
                start = mid + 1; // Search for a closer lowerBound on the right
            } else {
                end = mid - 1; // Search on the left
            }
        }

        return lowerBound;
    }

    // upperBound
    public static int upperBoundOfArr(int[] arr,int n, int x) {
        int start = 0;
        int end = n - 1;

        if (x > arr[end]) {
            return -1; // No upperBound exists
        }

        int upperBound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < x) {
                // Possible upperBound value
                upperBound = arr[mid];
                start = mid + 1; // Search on the right
            } else {
                end = mid - 1; // Search for a closer upperBound on the left
            }
        }

        return upperBound;
    }
}
