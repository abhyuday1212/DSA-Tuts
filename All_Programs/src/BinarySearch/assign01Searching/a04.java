package assign01Searching;

import java.util.Arrays;

//Find First and Last Position of Element in Sorted Array
public class a04 {

    public static void main(String[] args) {
        int[] mumArr = {3, 4, 5, 6, 8, 9, 22,22,22, 54};
        int[] ans = searchRange(mumArr, 22);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] numbs, int target) {
        int[] ans = {-1, -1};

        // Check for the first occurrence of target;
        int start = searchTargetIndex(numbs, target, true);
        int end = searchTargetIndex(numbs, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // This function returns the index value of target
    public static int searchTargetIndex(int[] numbs, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbs.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < numbs[mid]) {
                end = mid - 1;
            } else if (target > numbs[mid]) {
                start = mid + 1;
            } else {
                // Potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}