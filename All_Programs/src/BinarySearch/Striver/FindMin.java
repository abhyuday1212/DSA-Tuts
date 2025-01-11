package BinarySearch.Striver;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {11, 13, 15, 17};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int tempAns = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] <= nums[mid]) {// nums array is left sorted
                tempAns = Math.min(tempAns, nums[start]);
                start = mid + 1;

            } else { //nums array from the right of the mid is sorted
                tempAns = Math.min(tempAns, nums[mid]);
                end = mid - 1;
            }
        }

        return tempAns;
    }
}
