package LeetCode.TwoPointer.Medium;

import java.util.HashSet;

public class MaximumErasureValue {
    /*brute force - time limited
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set;
        int answer = 0;
        
        for(int i=0; i<nums.length; i++){
            set = new HashSet<>();
            
            for(int j=i; j<nums.length; j++){
                if(!set.contains(nums[j])) set.add(nums[j]);
                else break;
            }
            
            int max = 0;
            
            for(int j : set) max += j;
            
            answer = Math.max(max, answer);
        }
        
        return answer;
    }
    */
    //sliding window
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        int idx = 0;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                while(set.contains(nums[i])){
                    sum -= nums[idx];
                    set.remove(nums[idx]);
                    idx++;
                }
            }
            
            set.add(nums[i]);
            sum += nums[i];
            answer = Math.max(answer,sum);
        }
        
        return answer;
    }    

    /*two pointer - sliding window
    public int maximumUniqueSubarray(int[] nums) {
        int answer = 0, len = nums.length, max = 0;
        int i = 0 , j = 0;
        HashSet<Integer> set = new HashSet<>();
        
        while(i < len && j < len){
            if(set.contains(nums[j])){
                while(set.contains(nums[j])){
                    set.remove(nums[i]);
                    max -= nums[i++];    
                }
            }
            
            set.add(nums[j]);
            max += nums[j++];
            answer = Math.max(answer, max);
        }
        
        return answer;
    }
    */
}
