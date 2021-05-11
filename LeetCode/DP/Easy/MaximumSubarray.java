package LeetCode.DP.Easy;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105
*/
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

/*kadane
public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i:nums){
            sum += i;
            
            max = Math.max(max, sum);
            sum = Math.max(sum ,0);
        }
        
        return max;
    }
*/
