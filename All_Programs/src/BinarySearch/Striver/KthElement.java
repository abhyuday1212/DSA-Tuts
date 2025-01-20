package BinarySearch.Striver;

import java.util.ArrayList;
import java.util.List;

public class KthElement {
    public static void main(String[] args) {
        int[] a = {8, 10, 10, 11, 12, 13, 13, 13};
        int[] b = {5, 6, 8, 10, 13};
        System.out.println(kthElement(a, b, 4));
    }

    public static int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0;
        int count = 0;

        while (i < a.length && j < b.length) {
            int current;
            if (a[i] <= b[j]) {
                current = a[i];
                i++;
            } else {
                current = b[j];
                j++;
            }

            count++;
            if (count == k) {
                return current;
            }
        }

        // Handle remaining elements in array `a`
        while (i < a.length) {
            count++;
            if (count == k) {
                return a[i];
            }
            i++;
        }

        // Handle remaining elements in array `b`
        while (j < b.length) {
            count++;
            if (count == k) {
                return b[j];
            }
            j++;
        }
        return -1;
    }
}
