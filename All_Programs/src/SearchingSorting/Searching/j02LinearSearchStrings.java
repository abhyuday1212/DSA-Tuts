package SearchingSorting.Searching;

public class j02LinearSearchStrings {
    public static void main(String[] args) {
        String name = "Abhyuday";
        char targ = 'a';
//        Method 1:
//        StringSearch(name, targ);

        // Method 2:

        StringSearch2(name, targ);

    }

   static void StringSearch(String str, char target) {
       if (str.length() == 0) {
           System.out.println("String is Empty");
       }

       // create a for loop to iterate at every element of the string and search for the target;
       boolean found = false;
       for (int i = 0; i < str.length(); i++) {
           if (target == str.charAt(i)) {
               System.out.println("Element found in the string at index " + i + " ");
               found = true;
           }
       }
       if (!found) {
           System.out.println("Target does not exist in the array");
       }
   }

    static void StringSearch2(String str, char target) {
        if (str.length() == 0) {
            System.out.println("String is Empty");
        }

        // create a for loop to iterate at every element of the string and search for the target;
        boolean found = false;
        for (char element : str.toCharArray()) {
            if (element == target) {
                System.out.println("Element found ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Target does not exist in the array");
        }
    }


}
