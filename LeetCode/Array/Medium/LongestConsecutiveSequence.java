package LeetCode.Array.Medium;

import java.util.HashSet;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
public class LongestConsecutiveSequence {
    /*time limited
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        for(int i:nums) set.add(i);
        
        for(int n : set){
            int count = 1;
            
            while(set.contains(n+1)){
                n = n+1;
                count++;
            }
            
            answer = Math.max(count, answer);
        }
        
        return answer;
    }
    */
    //415ms 
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(), check = new HashSet<>();
        int answer = 0;
        
        for(int i:nums) set.add(i);
        
        for(int n : set){
            int count = 1;
            
            if(check.contains(n)){
                answer = Math.max(count, answer);
                continue;
            }
            
            check.add(n);
            
            while(set.contains(n+1)){
                n = n+1;
                check.add(n);
                count++;
            }
            
            answer = Math.max(count, answer);
        }
        
        return answer;
    }
    /*13ms
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        for(int i:nums) set.add(i);
        
        for(int n : set){
            if(!set.contains(n-1)){
                int cur = n, count = 1;
                
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                
                answer = Math.max(count, answer);
            }
        }
        
        return answer;
    }
    */
}
