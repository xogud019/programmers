package LeetCode.Hash.Easy;

import java.util.Map;
import java.util.HashMap;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        int n = A.length/2;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i:A){
            map.put(i, map.getOrDefault(i,0)+1);    
        }
        
        for(int i:map.keySet()){
            if(map.get(i)==n){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
