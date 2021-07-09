package CodingTest.LeetCode.Greedy.Medium;
/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 3 * 104
0 <= nums[i] <= 105
*/
public class JumpGame {
    /*backtracking time limited
    public boolean canJump(int[] nums) {
        return reachPos(nums, 0);
    }
    
    public boolean reachPos(int[] nums, int pos){
        if(pos == nums.length -1) return true;
        
        int maxPos = Math.min(nums.length-1, pos + nums[pos]);
        
        for(int next = pos+1; next <= maxPos; next++){
            if(reachPos(nums, next)) return true;
        }
        
        return false;
    }
    */
    //greedy
    public boolean canJump(int[] nums) {
        int maxPos = nums.length-1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(i + nums[i] >= maxPos) maxPos = i;
        }
        
        return maxPos == 0;
    }
}
