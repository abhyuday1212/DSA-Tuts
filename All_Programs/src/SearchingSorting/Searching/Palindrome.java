package SearchingSorting.Searching;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "abac";
        System.out.println(isPalindrome(str1));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;

            }
        }

        return true;
    }
}
