package LeetCode.Math.Medium;
/*
You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:

0 <= i < j < nums.length
nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.

 

Example 1:

Input: nums = [42,11,1,97]
Output: 2
Explanation: The two pairs are:
 - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
Example 2:

Input: nums = [13,10,35,24,76]
Output: 4
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 109
*/
public class CountNicePairsInAnArray {
    /*time out
    static final int mod = 1000000007;
    
    public int countNicePairs(int[] nums) {
        int len = nums.length;
        int answer = 0;
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(i==j) continue;
                
                long r1 = rev(nums[i]), r2 = rev(nums[j]);
                
                if(nums[i] + r2 == r1 + nums[j]) answer = (answer+1)%mod;
            }
        }
        
        return answer/2;
    }
    
    public long rev(int num){
        long ans = 0;
        
        while(num > 0){
            int n = num%10;
            num /= 10;
            ans = ans*10 + n;
        }
        
        return ans;
    }
    */
}
