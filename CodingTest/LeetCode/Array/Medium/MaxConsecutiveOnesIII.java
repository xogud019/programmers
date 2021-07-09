package CodingTest.LeetCode.Array.Medium;
/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
*/
public class MaxConsecutiveOnesIII {
    //sliding window
    public int longestOnes(int[] nums, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0, answer = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) sb.append("1");
            else{
                if(k == 0){
                    sb = new StringBuilder();
                    continue;
                }
                
                if(count < k){
                    sb.append("0");
                    count++;
                }
                else{
                    while(count >= k && sb.length() > 0){
                        if(sb.charAt(0) == '1') sb.deleteCharAt(0);
                        else{
                            count--;
                            sb.deleteCharAt(0);
                        }
                    }
                    
                    sb.append("0");
                    count++;
                }
            }
            //System.out.println(sb.toString());
            answer = Math.max(answer, sb.length());
        }
        
        return answer;
    }
}
