package RecursionQuickSort;
/*
Choose any element as pivot -> after first pass -> elements that are less than the pivot will be on LHS && elements that are greater than pivot will be on RHS

USP: in quick sort you are placing pivot at the correct position
* */

/*
* How to put pivot at correct position?
Whenever we find a voilation that a number like when LHS is larger than the pivot and number at RHS is smaller than the pivot.

* wherever there is voilation happens swap the numbers...

* */

//------------- How to pick pivot?
//Method-1:
/*
 * 1- Random Element:
 * 2- Corner Elements:
 * 3- Pick the middle Elements:
 * */

import java.util.Arrays;

/*
N elements are divided into - K, pivot element(1), n-k-1
* Reccurence relation of Quick Sort: T(N) = T(K) + T(N-k-1) + O(N)

Time Complexity:
O(N^2)
* */
public class RecursionQuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickRecursionSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    //if you are not making the copies of the array then how you are making sure that you are taking parts of the array

    //The low and high is for figuring out that on which part you are working on

    // Start and end are for swapping in that particular part

    static void quickRecursionSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - 1) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }

            while (nums[end] > pivot) {
                end--;
            }

            //now when both will be voilationg the condition than swapping both wikk solve the both the voilations

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;

            }
        }

        //now my pivot is at correct index, now check the remaining two halve now
        quickRecursionSort(nums, low, end);
        quickRecursionSort(nums, start, high);
    }
}

