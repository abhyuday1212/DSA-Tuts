import java.util.*;

public class j07EvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {3, 23, 1, 42, 5, 7};
        System.out.println(findNumbers(numbers));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (evenNums(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean evenNums(int eleVals) {

//        Method 1 of finding digits length
//        int eleValscounter = 0;
//        while (eleVals>0){
//            eleVals = eleVals/10;
//            eleValscounter++;
//        }


//        Above line of code will find the number of digits in an given number;
        String numStr = String.valueOf(eleVals);
        int digits = numStr.length();

        if (digits % 2 == 0) {
            return true;
        }

        return false;
    }
}

