package RecursionQuests.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        System.out.println(sumOfArr2(arr, 0, 0));
        System.out.println(sumOfArr1(arr, 0));
    }

    //Nice Method, here if the index reaches the last index the base condition hits and recursion but till then array sum is counted to know about the value
    static int sumOfArr1(int[] arr, int index) {
        if (arr.length == index) {
            return 0;
        }

        // small subtask -> finding sum from index+1 to n;
        //-> self task --> Add the index values to the return value
        return arr[index] + sumOfArr1(arr, index + 1);
    }

    static int sumOfArr2(int[] arr, int index, int sum) {
        if (arr.length - 1 == 0) return 0;

        if (arr.length - 1 == index) {
            return sum + arr[index];
        }

        //Sum
        return arr[index] + sumOfArr2(arr, index + 1, sum);
    }
}
