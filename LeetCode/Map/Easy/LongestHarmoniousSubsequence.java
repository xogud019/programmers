package LeetCode.Map.Easy;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i:nums) map.put(i, map.getOrDefault(i,0)+1);
        
        if(map.size() == 1) return 0;

        for(int i:map.keySet()){
            if(map.containsKey(i+1)) answer = Math.max(answer, map.get(i)+map.get(i+1));
        }
        
        return answer;
    }
    /*time out
        public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i:nums) map.put(i, map.getOrDefault(i,0)+1);
        
        if(map.size() == 1) return 0;

        for(int i:map.keySet()){
            for(int j:map.keySet()){
                if(i==j) continue;
                
                if(Math.abs(i-j)== 1) answer = Math.max(answer , map.get(i)+map.get(j));
            }
        }
        
        return answer;
    }
    */
}
