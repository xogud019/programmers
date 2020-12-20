package LeetCode.TwoPointer.Medium;

import java.util.HashSet;

public class MaximumErasureValue {
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
}
