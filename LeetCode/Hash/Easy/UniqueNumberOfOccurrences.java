package LeetCode.Hash.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr) map.put(i, map.getOrDefault(i,0)+1);
        
        
        for(int i:map.keySet()) set.add(map.get(i));
        
        return map.size()==set.size()? true : false;
    }
}
