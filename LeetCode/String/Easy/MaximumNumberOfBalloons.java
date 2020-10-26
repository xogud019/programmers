package LeetCode.String.Easy;

import java.util.*;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        int answer = Integer.MAX_VALUE;
        
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        
        for(int i=0; i<text.length(); i++){
            if(map.containsKey(text.charAt(i))) map.put(text.charAt(i),map.get(text.charAt(i))+1);    
        }
        
        map.put('l', map.get('l')/2);
        map.put('o', map.get('o')/2);
        
        for(char c : map.keySet()){
            answer = Math.min(answer,map.get(c));    
        }
        
        return answer;
    }
}
