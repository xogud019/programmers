package CodingTest.LeetCode.Array.Medium;
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

    //idea
    /*
    the idea is based on: if array is valid, the all the subarray ends at its maximum value is also valid:
    a small example:
    [1,2,4] ,and L = 4, R = 5:
    4 is the maximum value, then all the subarray ends at 4 will be valid, which is [4], [2, 4], [1, 2, 4], so res = 3
    the code is

    if(A[i] >= L)
        last = i;
    res += last - start;
    then what if we have these smaller values than peak value:
    [1,2,4,3,0] and L = 4, R = 5:
    then valid subarray ends at 3 are [4, 3], [2, 4, 3], [1, 2, 4, 3],
    same thing, valid subarray ends at 0 are [4, 3, 0], [2, 4, 3, 0], [1,2,4,3,0],
    the code is:

    res += last - start;
    */
    /*short
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length, start = -1, end = -1, answer = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] > right){
                end = i;
                start = i;
                continue;
            }
            
            if(nums[i] >= left) end = i;
            
            answer += end - start;
        }
        
        return answer;
    }
    */
}
