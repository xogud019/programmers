package LeetCode.Sort.Hard;

import java.util.LinkedList;
import java.util.Queue;

/*
Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

You must write an algorithm that runs in linear time and uses linear extra space.

 

Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 109
*/
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        
        int radix = 1, max = 0;
        
        for(int i:nums) max = Math.max(i, max);
        
        while(radix <= max) radix *= 10;
        
        int r = 1;
        Queue<Integer>[] q;
        
        while(r < radix){
            q = new LinkedList[10];    
            
            for(int i=0; i<10; i++) q[i] = new LinkedList<Integer>();
            
            //push bucket
            for(int i:nums){
                int idx = 0;
                
                if(i < r) idx = 0;
                else idx = (i/r)%10;
                
                q[idx].add(i);
            }
            
            int idx = 0;
            
            for(int i=0; i<10; i++){
                while(!q[i].isEmpty()) nums[idx++]=(int)q[i].poll();
            }
            
            r *= 10;
        }
        
        int answer = 0;
        
        for(int i=0; i<nums.length-1; i++) answer = Math.max(nums[i+1]-nums[i], answer);
        
        return answer;
    }
}
