import java.util.*;

public class j01LinearSearch {
    public static void main(String[] args) {

        int[] nums = {1, 3, 32, 4, 21, 33, 4, 54, 33, 36};
        int targetVal = 33;
        fnLinearSearch(nums, targetVal);

    }
    // creating a function that prints the output if the element is found or not

    static void fnLinearSearch(int[] arr, int taget) {
        // perform check that array exists
        if (arr.length == 0) {
            System.out.println("Array does not exists");
        }
 
        for (int i = 0; i < arr.length; i++) {
            if (taget == arr[i]) {
                System.out.println("Element found at " + i + " index");
            }
        }

        System.out.println("Element not found, try another number");

    }
}
