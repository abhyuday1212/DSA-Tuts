package Arrays.RotateArray;

public class SingleElement {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int xor1 = 0;

        for(int i = 0 ; i < nums.length; i++){
            xor1= xor1^ nums[i];
        }

        return xor1;
    }
}
