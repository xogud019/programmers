package CodingTest.LeetCode.Math.Medium;

import java.util.Arrays;

/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

 

Example 1:

Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
Example 2:

Input: nums = [1,10,2,9]
Output: 16
 

Constraints:

n == nums.length
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        /*avg - failed
        int sum = 0, answer = 0;
        
        for(int i:nums) sum += i;
        
        int avg = sum/nums.length;
        
        for(int i:nums) answer += Math.abs(i-avg);
        
        return answer;
        */
        /*mid val - using for 2ms
        Arrays.sort(nums);
        
        int mid = nums.length/2, answer = 0;
        
        for(int i:nums) answer += Math.abs(i - nums[mid]);
        
        return answer;
        */
        //using while 2ms
        Arrays.sort(nums);
        
        int mid = nums.length/2, answer = 0;
        int i = 0, j = nums.length-1;
        
        while(i<j) answer += Math.abs(nums[mid] - nums[i++]) + Math.abs(nums[mid] - nums[j--]);
       
        return answer;
    }
}
