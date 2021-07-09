package CodingTest.LeetCode.Array.Medium;
//yet
import java.util.Arrays;
/*
Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.

Return the shortest such subarray and output its length.

 

Example 1:

Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Example 3:

Input: nums = [1]
Output: 0
 

Constraints:

1 <= nums.length <= 104
-105 <= nums[i] <= 105
 

Follow up: Can you solve it in O(n) time complexity?
*/
public class ShortestUnsortedContinuousSubarray {
	//n^2
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0, end = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        
        boolean s = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != nums[i]){
                if(!s){
                    start = i;
                    s = true;
                }
                else end = i;
            }
        }
        
        if(start == 0 && end == 0) return 0;
        
        return end - start +1;
    }

    /*using stack O(n)
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int len = nums.length;
        int left = len, right = 0;
        
        for(int i=0; i<len; i++){
            while(!stk.isEmpty() && nums[stk.peek()] > nums[i]) left = Math.min(left, stk.pop());
            stk.push(i);
        }
        
        stk.clear();
        
        for(int i=len-1; i>=0; i--){
            while(!stk.isEmpty() && nums[stk.peek()] < nums[i]) right = Math.max(right, stk.pop());
            stk.push(i);
        }
        
        return right - left > 0 ? right - left + 1 : 0;
    }
    */
}
