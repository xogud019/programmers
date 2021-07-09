package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int answer = -1;
        
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet()){
            if(i==map.get(i)) answer = Math.max(answer, i);
        }
        
        return answer;
    }
}
