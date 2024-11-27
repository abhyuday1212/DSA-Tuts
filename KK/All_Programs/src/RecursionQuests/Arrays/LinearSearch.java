package RecursionQuests.Arrays;

/**
 Big problem, f(arr, target, idx )
 => is target present in the array arr starting from index

 Small Problem/ Recursive work
 f(arr, target, idx + 1)
 => is target present in the array arr starting from index (idx +1)

 Self work
 => check if current element arr[idx] is equal to target.

 Base case
 //Check for out of bond condition
 => check if index == arr.length return false;
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 9};
        System.out.println(findElement(arr, 4, 0));
        System.out.println(findElementIndex(arr, 4, 0));
    }


    static boolean findElement(int[] arr, int target, int index) {
//base condition
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || findElement(arr, target, index + 1);
    }


    static int findElementIndex(int[] arr, int target, int index) {
//base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findElementIndex(arr, target, index + 1);
        }
    }
}
