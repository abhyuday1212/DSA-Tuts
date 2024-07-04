package assign01Searching;
//https://leetcode.com/problems/find-in-mountain-array/description/

// Find in mountain Array
public class SearchInMountain {

    public static void main(String[] args) {
        int[] ipArr = {2, 3, 4, 9, 5, 6, 7};
        int ans = search(ipArr, 6);
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int start = 0;
        int firstTry = OrderAgnosticBS(arr, target, start, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half

        return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // 6,5 -> will be going in decreasing array
                // This may be the ans but check the left part of the array
                // That is the reason we are not using end = mid -1;
                end = mid;
            } else {
                start = mid + 1;
                // You are in the ascending part of the array
                // because we know that mid+1 element is greater than the mid element

            }

        }

        // if we exits the loop, than start == end will be pointing towards same larget number because of the above two checks
        // start and end are always trying to find max element in the above two checks
        //hence when they are pointing to the same element than it must be the maximum one.
        return start; //or return end as start == end;
    }


    public static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAscend = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element " + target + " Found at index " + mid);
                return mid;
            } else if (isAscend) {
                //! ascending order

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                //! descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
