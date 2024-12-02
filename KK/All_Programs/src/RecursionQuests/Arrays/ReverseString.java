package RecursionQuests.Arrays;

public class ReverseString {

    static String reverse(String str, int index) {
        if (index == str.length()) return "";

        return reverse(str, index + 1) + str.charAt(index);
    }

    public static void main(String[] args) {
        String myStr = "Abhyuday";
        System.out.println(reverse(myStr, 0));

    }

}
