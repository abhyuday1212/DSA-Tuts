package assign01Searching;

import java.util.*;

public class a01Ceiling {
    public static void main(String[] args) {
        int[] ipArr = {10143, 29122, 30010};
        int key = 23112;
        int ans = ceiling(ipArr, key);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Answer found at index " + ans + " and the element is " + ipArr[ans]);
        }
    }
// Ceiling ->return Smallest number greater or equal to the target

    static int ceiling(int[] arr, int target) {
        int start = 0;  //index
        int end = arr.length - 1;   //index

        // What if the target is greater than the greatest number in the array
        if (target > arr[end] || target < arr[0]) {
            return -1;
        }

        int upperBoundAns = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;   //index

            if (target >= arr[mid]) {
                upperBoundAns = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }

        // Condition that will execute this code: "End" "Target" "Start", and we need the element that is just greater than the target element.
        return upperBoundAns;
    }

}