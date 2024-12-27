package Recursion.RecursionQuests;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 9, 13};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
            //array is sorted
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
