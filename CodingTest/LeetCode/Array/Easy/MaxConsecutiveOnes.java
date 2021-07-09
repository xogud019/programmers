package CodingTest.LeetCode.Array.Easy;
/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int count = 0;
        
        for(int i:nums){
            if(i==1) count++;
            else{
                answer = Math.max(answer,count);
                count = 0;
            }
        }
        
        if(count != 0) answer = Math.max(answer, count);
        
        return answer;
    }
    /*
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0, count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) count++;
            else{
                answer = Math.max(answer, count);
                count = 0;
            }
        }
        
        answer = Math.max(answer, count);
        
        return answer;
    }
    */
    /*sliding window
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1) return nums[0];
        int answer = 0, left = 0, len = nums.length;
        
        for(left=0; left<len; left++){
            int count = 0;
            
            while(left < len && nums[left] != 0){
                count++;
                left++;
            }
            
            answer = Math.max(count, answer);
        }
        
        return answer;
    }
    */
}
