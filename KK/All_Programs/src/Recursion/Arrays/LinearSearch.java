package Recursion.Arrays;

import java.util.ArrayList;

/**
 * Big problem, f(arr, target, idx )
 * => is target present in the array arr starting from index
 * <p>
 * Small Problem/ Recursive work
 * f(arr, target, idx + 1)
 * => is target present in the array arr starting from index (idx +1)
 * <p>
 * Self work
 * => check if current element arr[idx] is equal to target.
 * <p>
 * Base case
 * //Check for out of bond condition
 * => check if index == arr.length return false;
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 4, 7, 9};
//        System.out.println(findElement(arr, 4, 0));
//        System.out.println(findElementIndex(arr, 4, 0));

//        findAllElementIndex(arr, 4, 0);

//        ----------------- Returned as list
        ArrayList<Integer> ans = findAllElementIndexList(arr, 4, 0);

        System.out.println(ans);
        // print array the elements separately
//        for (Integer i : ans) {
//            System.out.print(i);
//        }
    }


    static boolean findElement(int[] arr, int target, int index) {
//base condition
        if (index == arr.length) {
            return false;
        }

        // self work
        if (arr[index] == target) {
            return true;
        }

        // smaller problem
        return findElement(arr, target, index + 1);
//        return arr[index] == target || findElement(arr, target, index + 1);
    }


    static int findElementIndex(int[] arr, int target, int index) {
//*base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findElementIndex(arr, target, index + 1);
        }
    }


    //! Given an array of size N and an integer X. The task is to find all the indices of the integer X in the array.
    static void findAllElementIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println("Element not found");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();


        if (arr[index] == target) {
//            list.add(index);
            System.out.println(index);
            findAllElementIndex(arr, target, index + 1);
        } else {
            findAllElementIndex(arr, target, index + 1);
        }

//        System.out.println(list);
    }


    // ! Return the ans as ArrayList
    static ArrayList<Integer> findAllElementIndexList(int[] arr, int target, int index) {
        if (index >= arr.length - 1) {
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(index);
            return new ArrayList<Integer>(); // return empty array list
        }

        ArrayList<Integer> ans = new ArrayList<>();


        // Self Work
        if (arr[index] == target) {
            ans.add(index);
//            System.out.println(index);
        }


        // recursive work
        ArrayList<Integer> smallAns = findAllElementIndexList(arr, target, index + 1);
        ans.addAll(smallAns);

        return ans;
    }
}
