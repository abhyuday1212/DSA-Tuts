package Strings;

public class RotateString {
    public static void main(String[] args) {
        boolean ans = rotateString("abcde", "abced",0);
        System.out.println(ans);
    }

//    public static boolean rotateString(String s, String goal, int index) {
//        String tempStr = s;
//        String modifyStr = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            char firstChar = s.charAt(i);
//
//            tempStr = tempStr.substring(1);
//            modifyStr = tempStr + firstChar;
//            tempStr = modifyStr;
//
//            if (modifyStr.equals(goal)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    //M-2
    public static boolean rotateString(String s, String goal, int index) {
        if (s.length() == index) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }


        char ch = s.charAt(0);

        s = s.substring(1);
        String modifyStr = s + ch;
        s = modifyStr;


        return rotateString(s, goal, index+1);
    }
}
