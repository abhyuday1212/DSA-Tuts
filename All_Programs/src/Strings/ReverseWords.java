package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String trimmedStr = s.trim();
        String[] words = trimmedStr.split("\s+");
        int n = words.length;

        //simply reverse the given array of string in a n/2 time complexity;
        for (int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - i - 1];
            words[n - i - 1] = temp;
        }

        String finalString = String.join(" ", words);
        finalString.trim();

        System.out.println(finalString);


    }

}
