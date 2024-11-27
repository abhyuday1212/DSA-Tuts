package RecursionQuests.Permutations;

public class Ascii {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch + 0);

        subseqAscii("","abc");

    }

    static void subseqAscii(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        char ch = originalStr.charAt(0);

        subseqAscii(newStr + ch, originalStr.substring(1));
        subseqAscii(newStr, originalStr.substring(1));
        subseqAscii(newStr + (ch + 0), originalStr.substring(1));
    }

}
