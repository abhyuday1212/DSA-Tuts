package Arrays.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPlacesLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        rotateArr(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArr(int arr[], int d) {
        // temp = {1,2}
        // Step-1: Put the elements in the temporary Array

        if (arr.length == 0) {
            return;
        }

        if (d == arr.length) {
            return; // that array will not be rotated
        } else if (d > arr.length) {
            d = d % arr.length;
        }


        int n = arr.length; //n=5

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }

        // temp[] = {1,2}

        //Step:2-> Sice we have saved the values of initial indexes, So we can modify them as we wanted

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
            // 0 = d(2)
            // 1 = 3
            // 2 = 4
            //{3,4,5,4,5}
        }


        // Step:3 -> Put back the temp arr into the original One
        // n-d = 5-2 = 3
        for (int i = n - d; i < n; i++) {
            arr[i] = temp.get(i - (n - d));     // Sice temp is a list so we cannot use this method
        }

    }
}
