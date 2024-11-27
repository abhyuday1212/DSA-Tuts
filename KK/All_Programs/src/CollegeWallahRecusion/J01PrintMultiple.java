package CollegeWallahRecusion;

public class J01PrintMultiple {

    public static void main(String[] args) {
        printMultiples(2, 3);
    }

    static void printMultiples(int num, int k) {
        if (k == 0) {
            return;
        }

        int ans = num * k;

        printMultiples(num, k - 1);
        System.out.print(ans + " ");
        return;
    }
}
