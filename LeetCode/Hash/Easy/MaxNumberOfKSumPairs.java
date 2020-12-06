package LeetCode.Hash.Easy;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            if(map.containsKey(k-i)&& map.get(k-i)!=0){
                answer++;
                map.put(k-i, map.get(k-i)-1);
            }
            else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        return answer;
    }
}
