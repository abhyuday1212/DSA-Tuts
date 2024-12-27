package Recursion.RecursionQuests;

public class SearchViaRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 57, 4};
        int target = 23;
        System.out.println(linearSearch(arr, 0, target));
    }

    //     Method -1
    static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linearSearch(arr, index + 1, target);
    }


}
