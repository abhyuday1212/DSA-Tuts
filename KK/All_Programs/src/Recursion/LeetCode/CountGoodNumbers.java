package Recursion.LeetCode;

public class CountGoodNumbers {

    static int MOD = 1000000007;
    // digits at even indices-> even
// digits at odd indices -> prime(2,3,5,7)


    public static void main(String[] args) {
//        int finalAns = helper(2, 0, 1);
//        System.out.println(finalAns);
        // Calculate the number of even and odd positions in the digit string
        long n = 4;
        long oddPositions = n / 2;
        long evenPositions = (n + 1) / 2;

        // Calculate the total number of good digit strings
        // multiplying 5 by even because there could only be 5 even numbers between 0-9
        // multiplying 4 by odd because there could only be 4 prime numbers between

        long myAns = (pow(5, evenPositions) * pow(4, oddPositions) % MOD);
        System.out.println(myAns);
    }


    static long pow(long x, long y) {

        // Base case for the recursion
        if (y == 0) return 1;

        // Recursively calculate x^(n/2)
        long half = pow(x, y / 2);
// This will have the complexity log2y

        // If n is even, return (x^(n/2))^2
        if (y % 2 == 0) {
            return (half * half) % MOD;
        }
        // If n is odd, return (x^(n/2))^2 * x
        else {
            return (x * half * half) % MOD;
        }


    }


}


// digits at even indices-> even
// digits at odd indices -> prime(2,3,5,7)


// smaller problem -> (digit-> index) (isEven or isOdd)
// pick the first

//static int helper(long n, int index, int ans) {
//
//    if (index >= n) {
//        // If out of bound
//        return ans;
//    }
//
//
//    if (index % 2 == 0) {
//        // index is even
//        ans = ans * 5;
//        ans = helper(n, index + 1, ans);
//        return ans;
//    } else {
//        /// if index is odd
//
//        // self work
//        // ans = ans*4;
//
//        // smaller problem
//        ans = ans * 4;
//        ans = helper(n, index + 1, ans);
//        return ans;
//    }

