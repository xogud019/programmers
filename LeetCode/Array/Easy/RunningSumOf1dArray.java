package LeetCode.Array.Easy;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            nums[i] += sum;
            sum = nums[i];
        }
        
        return nums;
    }
}
