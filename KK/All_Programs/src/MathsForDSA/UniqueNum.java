package MathsForDSA;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 5, 4, 3, 3};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            // implementing XOR operation for each numbers
            unique ^= n;
        }

        return unique;
    }
}
