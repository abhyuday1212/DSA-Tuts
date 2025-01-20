package BinarySearch.Striver;

public class CountOfOnes {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(rowWithMax1s(arr));
    }

    public static int rowWithMax1s(int arr[][]) {
        int maxCount = 0;
        int index = 0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int m = arr[i].length;

            int countOne = m - count1sOfEachRow(arr[i], m, 1);

            if (maxCount < countOne) {
                index = i;
                maxCount = countOne;
            }

        }

        return index;
    }

    //this will give the number of 1s in the row

    public static int count1sOfEachRow(int[] arr, int m, int x) {
        int start = 0;
        int end = m - 1;

        int ans = m; //this is giving the index of the first element only

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
