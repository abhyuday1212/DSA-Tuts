import java.util.*;

public class j09BinarySearch {
    public static void main(String[] args) {
        int[] ipArr = {2, 3, 5, 9, 14, 16, 18};
        int key = 15;
        int ans = BinarySearch(ipArr, key);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Answer found at index " + ans + " and the element is " + ipArr[ans]);
        }
    }


// Ceiling -> Smallest number greater or equal to the target

    static int BinarySearch(int[] arr, int target) {
        int start = 0;  //index
        int end = arr.length - 1;   //index
        while (start <= end) {
            int mid = start + (end - start) / 2;   //index

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }

        return -1;
    }

}