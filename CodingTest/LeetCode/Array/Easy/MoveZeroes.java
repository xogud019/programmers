package CodingTest.LeetCode.Array.Easy;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        
        for(int i:nums){
            if(i!=0){
                arr[idx++] = i;
            }    
        }
        
        for(int i=idx; i<arr.length; i++){
            arr[i] = 0;
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
    /*
    int idx = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }    
        }
    */

    /*
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        
        for(int i=0; i<len-1; i++){
            if(nums[i] == 0){
                for(int j = i; j<len-1; j++) nums[j] = nums[j+1];
                
                nums[len-1] = 0;
                len--;
                i--;
            }
        }
    }
    */
}
