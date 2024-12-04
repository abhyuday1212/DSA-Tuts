package Arrays.Leetcode;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};

        rotate(arr,2);
    }
   static  void rotate(int[] nums, int k) {

       //make a copy of numsay
       int[] temp = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           temp[i] = nums[i];
       }

       int n = nums.length;

       //rotate towards right
       for(int i = 0; i <k +  1 ; i++){
           nums[n-k-1-i] = nums[n-1-i];
       }

//  copy the remaining nums array fill
       for(int i =0; i <=k; i++){
           nums[n-k-1 + i] = temp[i];
       }

   }
}
