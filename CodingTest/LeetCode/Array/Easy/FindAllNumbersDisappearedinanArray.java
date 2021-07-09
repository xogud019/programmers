package CodingTest.LeetCode.Array.Easy;
import java.util.*;
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 
*/
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i])-1;
            
            if(nums[val]>0) nums[val] = -nums[val];
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) answer.add(i+1);
        }
        
        return answer;
    }
}
