package LeetCode.Array.Easy;
/*
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 

Note:

1.1 <= k <= n <= 30,000.
2.Elements of the given array will be in the range [-10,000, 10,000].
*/
public class MaximumAverageSubarrayI {
    /*time out
    public double findMaxAverage(int[] nums, int k) {
        double answer = Integer.MIN_VALUE;
        double sum = 0;
        if(nums.length==1 && nums.length == k) return nums[0];
        
        for(int i=0; i<=nums.length-k; i++){
            int temp = i+k-1;
            while(temp >= i){
                sum+=nums[temp];
                temp--;
            }
      
            sum = sum/k;
      
            if(answer < sum) answer = sum;
      
            sum = 0;
        }
        
        return answer;
    }
    */

    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int cur = 0;
        
        for(int i=0; i<k; i++) max += nums[i];
        
        cur = max;
        
        for(int i=1; i+(k-1)<nums.length; i++){
            cur -= nums[i-1];
            cur += nums[i+(k-1)];
            
            max = Math.max(max,cur);
        }
        
        return (double)max/(double)k;
    }
}
