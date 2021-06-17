package LeetCode.Array.Medium;
/*
We are given an array nums of positive integers, and two positive integers left and right (left <= right).

Return the number of (contiguous, non-empty) subarrays such that the value of the maximum array element in that subarray is at least left and at most right.

Example:
Input: 
nums = [2, 1, 4, 3]
left = 2
right = 3
Output: 3
Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
Note:

left, right, and nums[i] will be an integer in the range [0, 109].
The length of nums will be in the range of [1, 50000].
*/
public class NumberOfSubarraysWithBoundedMaximum {
    /*failed case - wrong answer
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length, count = 0, max = -1, answer = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                if(nums[i] >= left && nums[i] <= right){
                    max = nums[i];
                    count++;
                    answer += count;
                }
                else{
                    max = -1;
                    count = 0;
                }
            }
            else{
                if(nums[i] >= left && nums[i] <= right){
                    count++;
                    answer += count;    
                }
                else{
                    answer++;
                }
                
            }
            
            System.out.println(answer);
        }
        
        return answer;
    }
    */
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length, count = 0, j = 0, answer = 0;
        
        for(int i=0; i<n; i++){
            int num = nums[i];
            
            if(num >= left && num <= right){
                count = i - j + 1;
                answer += count;
            }
            else if(num < left) answer += count;
            else{
                count = 0;
                j = i+1;
            }
        }
        
        return answer;
    }
}
