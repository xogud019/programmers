package CodingTest.LeetCode.DP.Easy;
/*
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 

Constraints:

1 <= nums.length <= 104
-105 <= nums[i] <= 105
0 <= left <= right < nums.length
At most 104 calls will be made to sumRange.
*/
public class RangeSumQuery {
    class NumArray {
        int[] nums;
        
        public NumArray(int[] nums) {
            this.nums = nums;    
        }
        
        public int sumRange(int i, int j) {
            int answer = 0;
            
            for(int start = i; start <= j; start++){
                answer +=this.nums[start];    
            }
            
            return answer;
        }
    }

    /*using dp
    class NumArray {
        int[] dp;
        
        public NumArray(int[] nums) {
            dp = new int[nums.length];
            dp[0] = nums[0];
            
            for(int i=1; i<nums.length; i++) dp[i] = nums[i] + dp[i-1];
        }
        
        public int sumRange(int left, int right) {
            if(left == 0) return dp[right];
            else return dp[right] - dp[left-1];
        }
    }

    */
}
