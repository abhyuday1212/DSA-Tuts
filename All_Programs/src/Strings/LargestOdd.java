package Strings;

public class LargestOdd {
    public static void main(String[] args) {
        String num = "5264";

        String maxOdd = recursiveFun(num, "1");


        if (maxOdd.isEmpty()) {
            System.out.println("");
            ;
        } else {
            System.out.println(maxOdd);
        }
    }

    public static String recursiveFun(String num, String maxOdd) {
        if (num.isEmpty()) {
            return "";
        }

        long intVal = Long.parseLong(num);

        if (intVal % 2 != 0) {
            // Update maxOdd if the current value is larger
            return maxOdd = Long.toString(Math.max(Long.parseLong(maxOdd), intVal));
        }

        return recursiveFun(num.substring(0, num.length() - 1), maxOdd);
    }
}
