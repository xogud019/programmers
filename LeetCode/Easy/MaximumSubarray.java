package LeetCode.Easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int answer = Integer.MIN_VALUE;
        int sum = nums[0];
        /*
        for(int i=-1; i<nums.length-1; i++){
            sum = Math.max(sum+nums[i+1], nums[i+1]);
            answer = Math.max(sum,answer);
        }
        */
        for(int i=1; i<nums.length; i++){
            answer = Math.max(sum,answer);
            sum = Math.max(sum+nums[i], nums[i]);
        }
        
        answer = Math.max(sum,answer);
        return answer;
    }
}
