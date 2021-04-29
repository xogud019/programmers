package LeetCode.BinarySearch.Medium;
/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

Follow up: Could you write an algorithm with O(log n) runtime complexity?

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/
public class FindFirstAndLastPositionOfElementInSortedArray {
    //binary search
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binaryS(nums, target, true), binaryS(nums, target, false)};
    }
    
    public int binaryS(int[] nums, int target, boolean flag){
        int lo = 0, hi = nums.length-1, idx = -1;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            if(nums[mid] == target){
                idx = mid;
                
                if(!flag) lo = mid+1;
                else hi = mid-1;
            }
            else if(nums[mid] > target) hi = mid-1;
            else lo = mid+1;
        }
        
        return idx;
    }
    /*
    //sliding window
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                answer[0] = i;
                
                int j = i;
                
                while(j < nums.length && nums[j] == target){
                    j++;
                }
                
                answer[1] = j-1;
                break;
            }    
        }
        
        return answer;
    }
    */
}
