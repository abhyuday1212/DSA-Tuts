package backtracking;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
//        pathDirection("", 3, 3);

//        System.out.println(pathDirectionM2("", 3, 3));


//        System.out.println(pathDirectionDiagonals("", 3, 3));


        pathRestriction("", 3, 3);
    }


    static void pathDirection(String newStr, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(newStr);
            return;
        }

        if (r > 1) {
            pathDirection(newStr + "D", r - 1, c);
        }

        if (c > 1) {
            pathDirection(newStr + "R", r, c - 1);
        }
    }


    //returning a List of pathDirection

    static ArrayList<String> pathDirectionM2(String newStr, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();

        if (r > 1) {
            result.addAll(pathDirectionM2(newStr + "D", r - 1, c));
        }

        if (c > 1) {
            result.addAll(pathDirectionM2(newStr + "R", r, c - 1));
        }

        return result;
    }


    // returning ans with adding the possibility of diagonal elements also

    static ArrayList<String> pathDirectionDiagonals(String newStr, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        //instead of one recursion call, we will be making 3 recursion calls

        ArrayList<String> result = new ArrayList<>();

        if (r > 1 && c > 1) {
            result.addAll(pathDirectionDiagonals(newStr + "D", r - 1, c - 1));
        }

        if (r > 1) {
            result.addAll(pathDirectionDiagonals(newStr + "V", r - 1, c));
        }

        if (c > 1) {
            result.addAll(pathDirectionDiagonals(newStr + "H", r, c - 1));
        }

        return result;
    }


    //Suppose if at (2,2) there is a river or something such that it can not move further
    static void pathRestriction(String newStr, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(newStr);
            return;
        }

        if (r == 2 && c == 2) {
            return;
        }

        if (r > 1) {
            pathRestriction(newStr + "D", r - 1, c);
        }

        if (c > 1) {
            pathRestriction(newStr + "R", r, c - 1);
        }
    }

}
