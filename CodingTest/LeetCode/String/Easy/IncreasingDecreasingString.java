package CodingTest.LeetCode.String.Easy;

import java.util.*;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();
        int len = s.length();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        while(len > 0){
            String temp = "";
            
            for(char c:map.keySet()){
                if(map.get(c)>0){
                    temp += c;
                    map.put(c,map.get(c)-1);
                }
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(char c:map.keySet()){
                if(map.get(c)>0){
                    sb.append(c);
                    map.put(c,map.get(c)-1);
                }
            }
            
            sb = sb.reverse();
            
            len -= temp.length()+sb.length();
            
            answer += temp+sb.toString();
        }
        
        return answer;
    }
}
