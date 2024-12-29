package JavaBasics;

import java.util.Scanner;

public class j10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        //        if (fruit.equals("mango")) {
        //            System.out.println("King of fruit");
        //        }
        //        if (fruit.equals("apple")) {
        //            System.out.println("a sweet red fruit");
        //        }

        //        here comes the switch cases

        //        switch (fruit) {
        //            case "mango":
        //                System.out.println("King of fruits");
        //
        //            case "Apple":
        //                System.out.println("A sweet red color fruit");
        //                break;
        //
        //            case "grapes":
        //                System.out.println("Fruit from which bear is made");
        //
        //            default:
        //                System.out.println("Please enter a valid fruit");
        //        }

        // this is the prettier format

        //        switch (fruit) {
        //            case "mango" -> System.out.println("King of fruits");
        //            case "Apple" -> System.out.println("A sweet red color fruit");
        //            case "grapes" -> System.out.println("Fruit from which bear is made");
        //            default -> System.out.println("Please enter a valid fruit");
        //        }
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red color fruit");
            case "grapes" -> System.out.println("Fruit from which bear is made");
            default -> System.out.println("Please enter a valid fruit");
        }

        //        switch (day) {
        //            case 1 -> System.out.println("Monday");
        //            case 2 -> System.out.println("Tuesday");
        //            case 3 -> System.out.println("Wednesday");
        //            case 4 -> System.out.println("Thursday");
        //            case 5 -> System.out.println("Friday");
        //            case 6 -> System.out.println("Saturday");
        //            case 7 -> System.out.println("Sunday");
        //        }

        //        switch (day) {
        //            case 1:
        //            case 2:
        //            case 3:
        //            case 4:
        //            case 5:
        //                System.out.println("Weekday");
        //                break;
        //            case 6:
        //            case 7:
        //                System.out.println("Weekend");
        //                break;
        //        }

        //        switch (day) {
        //            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //            case 6, 7 -> System.out.println("Weekend");
        //        }
        sc.close();
    }
}

