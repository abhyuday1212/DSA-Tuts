package assign01Searching;
// find the index by assuming the infinite array and assume the array that is it is sorted array
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 12, 15, 19, 21, 23, 29};
        int target = 16;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // Initial condition: target>arr[end]
        while (getValue(arr, end) != Integer.MAX_VALUE && target > getValue(arr, end)) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }


        return binarySearch(arr, target, start, end);
    }

    static int getValue(int[] arr, int endIndex) {
        if (endIndex >= arr.length) {
            return Integer.MAX_VALUE;
        }
        return arr[endIndex];
    }
    static int binarySearch(int[] numbs, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < numbs[mid]) {
                end = mid - 1;
            } else if (target > numbs[mid]) {
                start = mid + 1;
            } else {
//  Mid is the ans where Target = arr[mid] displayed
                return mid;
            }
        }
// Nothing found
        return -1;
    }
}

