package day20_Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int[] nums = {12, 23,43,50,3,2};
        int maxNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maxNum){
                maxNum = nums[i];
            }

        }
        System.out.println(maxNum);
    }
}
