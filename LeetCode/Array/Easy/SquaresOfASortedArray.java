package LeetCode.Array.Easy;

import java.util.*;
/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
*/
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        for(int i=0; i<A.length; i++){
            A[i] *= A[i];
        }
        
        Arrays.sort(A);
        
        return A;
    }

    //brute force
    /*
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) nums[i] *= nums[i];
        
        Arrays.sort(nums);
        
        return nums;
    }
    */

    /*two pointer
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int lo = 0, hi = len-1, idx = len-1;
        int[] answer = new int[len];
        
        while(lo <= hi){
            if(Math.abs(nums[lo]) >= Math.abs(nums[hi])){
                answer[idx--] = nums[lo]*nums[lo];
                lo++;
            }
            else{
                answer[idx--] = nums[hi]*nums[hi];
                hi--;
            }
        }
        
        return answer;
    }
    */

    /*
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int lo = 0, hi = len-1, idx = len-1;
        
        int[] answer = new int[len];
        
        while(lo <= hi){
            if(Math.abs(nums[lo]) >= Math.abs(nums[hi])) answer[idx--] = nums[lo]*nums[lo++];
            else answer[idx--] = nums[hi]*nums[hi--];
        }
        
        return answer;
    }
    */
}
