import java.util.Scanner;


public class j11 {
    public static void main(String args[]) {

    //    fun1();

    //    int ans = fun2();
    //    System.out.println(ans);

    //    int ans = fun3(4, 7);
    //    System.out.println(ans);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name You want to display : \n");
        String enteredName = sc.next();
        String output = fun4(enteredName);
        System.out.println(output);
    }

    //Function Type-1 of return value is void type

//    static void fun1() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2 = sc.nextInt();
//
//        int num3 = num1 + num2;
//
//        System.out.println(num3);
//    }


    //Return value type

//    static int fun2() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//        return sum;
//    }

//    static int fun3(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }

    static String fun4(String inputName) {
        String msg = "Hello " + inputName;
        return msg;
    }


}
