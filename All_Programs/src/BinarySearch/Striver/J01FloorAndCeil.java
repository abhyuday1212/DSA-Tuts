package BinarySearch.Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J01FloorAndCeil {
    public static void main(String[] args) {
//        int[] arr = {1,2,4,6,9,11,12};
        int[] arr = {5,7,7,8,8,10};
        int n = arr.length;
        System.out.println(Arrays.toString((getFloorAndCeil(arr, n, 6))));
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int floor = floorOfArr(a, n, x);
        int ceil = ceilOfArr(a, n, x);

        return new int[]{floor, ceil};
    }

    // Floor
    public static int floorOfArr(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;

        if (x < arr[0]) {
            return -1; // No floor exists
        }

        int floor = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                // Possible floor value
//                floor = arr[mid];
                floor = mid;
                start = mid + 1; // Search for a closer floor on the right
            } else {
                end = mid - 1; // Search on the left
            }
        }


        return floor;
    }

    // Ceil
    public static int ceilOfArr(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;

        if (x > arr[end]) {
            return -1; // No ceil exists
        }

        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                // Possible ceil value
//                ceil = arr[mid];
                ceil = mid;
                end = mid - 1; // Search for a closer ceil on the left
            } else {
                start = mid + 1; // Search on the right
            }
        }

        return ceil;
    }
}
