package Arrays.RotateArray;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static String read(int n, int []book, int target){
        // 2-pointer approach
        int left = 0;
        int right = n - 1; // last index

        Arrays.sort(book);




        while (left < right) { // till the tym they are not crossing each other

            int currentSum = book[left] + book[right];

            if (currentSum == target) {
                return "YES";
            } else if (currentSum < target) {
                // move left as tge array is in sorted order so the value required to be
                // incremented
                // moving left
                left++;
            }

            else { // if (currentSum > target)
                // move the i pointer as we need to decrement the value;
                right--;
            }

        }

        return "NO";
    }
}
