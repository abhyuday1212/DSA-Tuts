package LeetcodePOTD.BinnarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class j01_2560 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        int k = 2;

        System.out.println(minCapability(arr, k));
    }

    public static int minCapability(int[] nums, int k) {

        int n = nums.length;
        int maxVal = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        int housesLeft = k;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            maxVal = nums[i];
            housesLeft = k-1;

            int index = i + 2;

            while (housesLeft > 0 && index < n) {
                maxVal = Math.max(maxVal, nums[index]);
                housesLeft--;
                index++;
            }

            if (housesLeft == 0) {
                System.out.println(maxVal);
                list.add(maxVal);
            }
        }

        Integer minCapacity = Collections.min(list);

        return (int) minCapacity;
    }
}
