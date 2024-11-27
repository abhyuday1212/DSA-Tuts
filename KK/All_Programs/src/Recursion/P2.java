package Recursion;

public class P2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 55, 66, 77, 99};
        int target = 55;
        int ans = Search(arr, target, 0,arr.length-1 );
        System.out.println(ans);
    }

    static int Search(int[] arr, int target, int s, int e)  {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return Search(arr, target, s, m - 1);
        }

        return Search(arr, target, m + 1, e);
    }
}
