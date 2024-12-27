package Recursion.Subset;

public class SkipAWord {
    public static void main(String[] args) {
        System.out.println(skipWord("knmknnapplejnkn"));
    }

    static String skipWord(String originalStr) {

        //base condition : if the substr is Empty
        if (originalStr.isEmpty()) {
            //if we have iterated over every elements of the string then the skipWord function should return null
            return "";
        }

        char ch = originalStr.charAt(0);

        //here we have modified this condition of (ch == 'a') because of
        if (originalStr.startsWith("apple")) {
            //will not be added to newStr
            return skipWord(originalStr.substring(5));
        } else {
            return ch + skipWord(originalStr.substring(1));
        }
    }

    static String skipAppNotApple(String originalStr) {

        //base condition : if the substr is Empty
        if (originalStr.isEmpty()) {
            //if we have iterated over every elements of the string then the skipWord function should return null
            return "";
        }

        char ch = originalStr.charAt(0);

        //here we have modified this condition of (ch == 'a') because of
        if (originalStr.startsWith("app") && !originalStr.startsWith("apple")) {
            //will not be added to newStr but 3 characters will be deleted
            return skipAppNotApple(originalStr.substring(3));
        } else {
            return ch + skipAppNotApple(originalStr.substring(1));
        }
    }

}
