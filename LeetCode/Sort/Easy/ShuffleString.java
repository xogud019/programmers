package LeetCode.Sort.Easy;

import java.util.TreeMap;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer, Character> map = new TreeMap<>();
        String answer = "";
        
        for(int i=0; i<indices.length; i++) map.put(indices[i], s.charAt(i));
        
        for(int i : map.keySet()) answer += map.get(i);
        
        return answer;
    }
}
