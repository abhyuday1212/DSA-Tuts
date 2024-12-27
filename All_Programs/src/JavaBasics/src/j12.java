import java.util.*;

public class j12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ======= Method 1 ================

        // array of primitives

        int[] arr1 = new int[5];
        arr1[0] = 23;
        arr1[1] = 45;
        arr1[2] = 233;
        arr1[3] = 543;
        arr1[4] = 3;
        System.out.println(arr1[2]);

        // ======= Method 3 : Using the toString method to show the array
        int[] arr3 = new int[5];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr3));

        // ======= Method 4 : Using for loop to show the array ================

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr4 = new int[size];
        System.out.println("Enter a number : ");

        for (int i = 0; i < arr4.length; i++) {
            int userInput = sc.nextInt();
            arr4[i] = userInput;
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i] + " ");
        }

        // ======= Method 5 : Using foreach loop to show the array ================

        System.out.print("Enter the size of the array: ");
        int size2 = sc.nextInt();

        int[] arr5 = new int[size2];
        System.out.println("Enter a number : ");

        for (int i = 0; i < arr5.length; i++) {
            int userInput = sc.nextInt();
            arr5[i] = userInput;
        }

        for (int num : arr5) { // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of the array
        }

        // ======= Method 6 : Using array of objects ================

        System.out.println("Enter size of the array : ");
        int Size = sc.nextInt();
        String[] str = new String[Size];
        
        System.out.println("Enter elements of the array : ");
        
        for (int i = 0; i < str.length; i++) {
        str[i] = sc.next();
        }
        
        System.out.println(Arrays.toString(str));

        // =============== 2-d Arrays
        // ================== Method 1 ======================
        int[][] arr2d = {
        {1, 2},
        {3, 4, 5},
        {6, 7, 8, 9}
        
        };
        
        for (int row = 0; row < arr2d.length; row++) {
        // inside the rows;
        for (int col = 0; col < arr2d[row].length; col++) {
        System.out.print(arr2d[row][col] + " ");
        }
        System.out.println();
        }

        // // ====== Method 2 ====================
        // System.out.println("Enter the value of arrays : ");
        // int[][] arr2 = new int[3][3];
        
        // for (int row = 0; row < arr2.length; row++) {
        // // inside the rows;
        // for (int col = 0; col < arr2[row].length; col++) {
        // arr2[row][col] = sc.nextInt();
        // }
        // System.out.println();
        // }
        
        // //output
        // for (int row = 0; row < arr2.length; row++) {
        // // inside the rows;
        // for (int col = 0; col < arr2[row].length; col++) {
        // System.out.print(arr2[row][col] + " ");
        // }
        // System.out.println();
        // }

        // ====== Method 3 ====================
        System.out.println("Enter the value of arrays : ");
        int[][] arr3 = new int[3][3];

        for (int row = 0; row < arr3.length; row++) {
            // inside the rows;
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        // output Method 1
        for (int row = 0; row < arr3.length; row++) {
        // inside the rows;
        System.out.println(Arrays.toString(arr3[row]));
        }
        output Method 2
        for (int[] elements : arr3) {
            // inside the rows;
            System.out.println(Arrays.toString(elements));
        }

    }
}