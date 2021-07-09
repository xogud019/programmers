package CodingTest.LeetCode.Array.Easy;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int answer = 0, temp = nums[0], count = 1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]>temp){
                temp = nums[i];
                count++;
            }
            else{
                temp = nums[i];
                answer = Math.max(count,answer);
                count = 1;
            }
        }
        
        return Math.max(answer,count);
    }
}
