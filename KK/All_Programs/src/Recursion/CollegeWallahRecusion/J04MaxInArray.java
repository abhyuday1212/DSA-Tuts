package Recursion.CollegeWallahRecusion;

public class J04MaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 8, 9};
        System.out.println(maxInArray(arr, 0));
    }

    static int maxInArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Sub Problem --> idx + 1, end of array --> max -->

        int smallAns = maxInArray(arr, index + 1);

// self work
        return Math.max(arr[index], smallAns);
    }
}
