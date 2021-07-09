package CodingTest.LeetCode.Math.Medium;
/*
You are given an integer array nums and two integers limit and goal. The array nums has an interesting property that abs(nums[i]) <= limit.

Return the minimum number of elements you need to add to make the sum of the array equal to goal. The array must maintain its property that abs(nums[i]) <= limit.

Note that abs(x) equals x if x >= 0, and -x otherwise.

 

Example 1:

Input: nums = [1,-1,1], limit = 3, goal = -4
Output: 2
Explanation: You can add -2 and -3, then the sum of the array will be 1 - 1 + 1 - 2 - 3 = -4.
Example 2:

Input: nums = [1,-10,9,1], limit = 100, goal = 0
Output: 1
 

Constraints:

1 <= nums.length <= 105
1 <= limit <= 106
-limit <= nums[i] <= limit
-109 <= goal <= 109
*/
public class MinimumElementsToAddToFormAGivenSum {
    public int minElements(int[] nums, int limit, int goal) {
        int answer = 0;
        long sum = 0;
        long temp = 0;
        for(int i:nums) sum += i;
        System.out.println(sum);
        if(sum == goal) return 0;
        
        temp = goal - sum;
        temp = Math.abs(temp);
        
        if(temp%limit == 0){
            answer = (int)(temp/limit);
        }
        else answer = (int)(temp/limit)+1;
        return answer;
    }
}
