package Recursion.Subset;

// Question-1
public class SkipACharacter {

    public static void main(String[] args) {
//        skipMethod1("", "baccabc");

//        System.out.println(skipMethod2("baccadaghi"));

        System.out.println(skipMethod3("abcad"));
    }

    // tail recursion
    static void skipMethod1(String newStr, String original) {
        //base condition : if index reaches end, return the string

        if (original.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        //Add Voillation logic that if string at the given index is same as the given index
        char ch = original.charAt(0);

        if (ch == 'a') {
            //will not be added to newStr
            //not take
            skipMethod1(newStr, original.substring(1));
        } else {
            //take
            skipMethod1(newStr + ch, original.substring(1));
        }
    }


    //functional recursion
    static String skipMethod2(String originalStr) {
        //base condition : if index reaches end, return the string

        if (originalStr.isEmpty()) {
            //if we have iterated over every elements of the string
            return "";
        }

        char ch = originalStr.charAt(0);

        if (ch == 'a') {
            //will not be added to newStr
            return skipMethod2(originalStr.substring(1));
        } else {
            return ch + skipMethod2(originalStr.substring(1));
        }
    }

    //! Skip a character via functional recursion
    static String skipMethod3(String originalStr) {
        if (originalStr.isEmpty()) {
            return "";
        }

        // recursive work
        String smallAns = skipMethod3(originalStr.substring(1));

        char ch = originalStr.charAt(0);

        if (ch != 'a') {
            // take
            return ch + smallAns;
        } else {
            return smallAns;
        }

    }
}
