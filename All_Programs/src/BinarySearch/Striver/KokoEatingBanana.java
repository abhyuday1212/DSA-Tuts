package BinarySearch.Striver;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] arr = {1,1,1,999999999};
        System.out.println(minEatingSpeed(arr, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;

        int end = piles[piles.length - 1];
        int ans = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int timeTaken = totalTimeWithKSpeed(piles, mid, h);

            if (timeTaken == 0) return mid;

            else if (timeTaken > 0) { //speed is greater so reduce the speed and check
                ans = mid;  //possible Ans
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int totalTimeWithKSpeed(int[] arr, int tempSpeed, int h) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= tempSpeed) {
                h = h - 1;
            } else {
                int timeRequired = arr[i] / tempSpeed;
                if (arr[i] % tempSpeed != 0) {
                    timeRequired += 1;
                }
                h = h - timeRequired;
            }
        }

        return h;
    }
}
