public class j10OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        1, 3, 32, 4, 21, 33, 44, 54
//        54, 44, 21, 4, 3, 1
        int[] ipArr = {54, 44, 21, 4, 3, 1};
        int key = 3;
        OrderAgnosticBS(ipArr, key);
    }

    static void OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find weather the array is sorted in ascending or descending order
        boolean isAscend = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element " + target + " Found at index " + mid);
                return;
            } else if (isAscend) {
//                ascending order

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
//                descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Element not found");
        return;
    }

}
