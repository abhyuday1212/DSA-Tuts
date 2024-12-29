package Arrays.RotateArray;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        //AntiClockwise
        //{2,3,4,5,1}
//        antiClockwiseRotate(arr1);

        // Clockwise Rotate
//        {5,1,2,3,4}
        clockwiseRotate(arr1);


    }

    static void clockwiseRotate(int[] arr1){
        //        {5,1,2,3,4}
        System.out.println("Before" + Arrays.toString(arr1));

        int n = arr1.length -1; //n points to index
        int temp = arr1[n]; //Add the last value into temp

        for (int i = 0; i < n; i++) {
            // Start from last
            arr1[n-i] = arr1[n-i-1];
        }

        arr1[0] = temp;

        System.out.println("After" + Arrays.toString(arr1));
    }

    static void antiClockwiseRotate(int[] arr1) {
        System.out.println("Before" + Arrays.toString(arr1));

        int temp = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i - 1] = arr1[i];
        }

        arr1[arr1.length - 1] = temp;

        System.out.println("After" + Arrays.toString(arr1));
    }
}
