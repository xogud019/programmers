package CodingTest.LeetCode.Array.Easy;

import java.util.HashMap;

public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int answer = 0;
        int occur = arr.length/4;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i:arr) map.put(i, map.getOrDefault(i,0)+1);
        
        for(int i:map.keySet()){
            if(map.get(i)>occur) return i;
        }
        
        return answer;
    }
}
