package CodingTest.LeetCode.Array.Easy;

import java.util.Collections;
import java.util.HashMap;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(), left = new HashMap<>(), right = new HashMap<>();
        int answer = nums.length, degree = 0;
        
        for(int i=0; i<nums.length; i++){
            if(!left.containsKey(nums[i])) left.put(nums[i],i);
            
            right.put(nums[i],i);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        degree = Collections.max(map.values());
        
        for(int i:map.keySet()){
            if(map.get(i)==degree){
                answer = Math.min(answer , right.get(i)-left.get(i)+1);
            }
        }
        
        return answer;
    }
}
