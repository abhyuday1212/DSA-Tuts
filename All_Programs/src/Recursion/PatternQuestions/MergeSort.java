package Recursion.PatternQuestions;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 66, 2, 3, 68};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeBoth(left, right);
    }

    private static int[] mergeBoth(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; //pointer for first
        int j = 0; //pointer for second
        int k = 0; //pointer for new array

        //while left & right are being compared and it is not going out of bound
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i]; //place items by taking each element and comparing it with second
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++; //move ahead for the new array pointer
        }

        //it may be possible that one array is not complete so add the remaining to the mix

        //copy the remaining arrays
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
