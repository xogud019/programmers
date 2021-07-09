package CodingTest.LeetCode.Prefix.Medium;

import java.util.HashMap;

/*
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/
public class SubarraySumEqualsK {
    /*n^2
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] pre = new int[len+1];
        int answer = 0;
        pre[0] = 0;
        
        for(int i=1; i<len+1; i++){
            pre[i] = pre[i-1] + nums[i-1];
        }
        
        for(int end = len; end>0; end--){
            for(int start = 0; start<end; start++){
                if(pre[end]-pre[start] == k) answer++;
            }
        }
        
        return answer;
    }
    */
    //n
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        
        for(int i=0; i<len; i++){
            sum += nums[i];
            
            if(map.containsKey(sum-k)) answer += map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        
        return answer;
    }
}
