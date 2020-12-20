package LeetCode.String.Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String newStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] str = newStr.split("\\s+");
        HashSet<String> ban = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s:banned) ban.add(s);
        
        for(String s:str){
            if(!ban.contains(s)) map.put(s, map.getOrDefault(s,0)+1);
        }
        
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
