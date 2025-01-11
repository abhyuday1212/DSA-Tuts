package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // range from 1 to n => use cycle sort
        // jo abhi index h uspe [current vallue] -1 hona chahiye
        // index = value-1 ==> At this index current value should be, If it is not present at the correct index than swap it with the correct index, now the number which came check weather that particular number is at correct position or not, If not then swap it to the correct index
//        ==> After all this you make 0{n-1} in worst case
//        => Check, Swap, Move

//        =========================
        /*
        - If range => [0,N} {0,1,2,3,4,5}
        * Every element will be at index = value;

        -If range => [1,N] {1,2,3,4,5}
        * Every element will be at index = value -1;

        */
//        ==========================

        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.print(Arrays.toString(arr));


    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
