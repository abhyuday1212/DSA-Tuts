import java.util.*;

public class j04MinArray {
    public static void main(String[] args) {
        int[] inputArr = {9, 5, 4, 3, 2};
        System.out.println(min(inputArr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        // Method
        // goto every array and compare with already initiallised array
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
