package assign01Searching;

// find position of an  element in a sorted array of infinite numbers
public class a05 {
    public static void main(String[] args) {
        int[] myArr = {2, 4, 6, 8, 12, 15, 16, 24, 45, 66, 69, 70};
        int finalAns = binarySearch(myArr, 55);
        System.out.println(finalAns);
    }

    static int binarySearch(int[] numbs, int target) {
        int start = 0;
        int end = numbs.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < numbs[mid]) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
//                Mid is the ans where Target = arr[mid] displayed
                return mid;
            }
        }
// Nothing found
        return -1;
    }
}
