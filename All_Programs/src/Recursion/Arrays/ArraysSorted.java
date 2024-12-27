package Recursion.Arrays;

public class ArraysSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index+1);
    }
}


/*
*sorted(arr, 0)
    |
    └── arr[0] < arr[1] (1 < 2) && sorted(arr, 1)
           |
           └── arr[1] < arr[2] (2 < 3) && sorted(arr, 2)
                  |
                  └── arr[2] < arr[3] (3 < 4) && sorted(arr, 3)
                         |
                         └── arr[3] < arr[4] (4 < 5) && sorted(arr, 4)
                                |
                                └── arr[4] < arr[5] (5 < 6) && sorted(arr, 5)
                                       |
                                       └── Base case reached: return true

* */