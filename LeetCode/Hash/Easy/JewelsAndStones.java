package LeetCode.Hash.Easy;

import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i=0; i<J.length(); i++){
            map.put(J.charAt(i),0);
        }
        
        for(int i =0; i<S.length(); i++){
            if(map.containsKey(S.charAt(i))) answer++;;
        }
        
        
        return answer;
    }
    
    /*
    HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i=0; i<J.length(); i++){
            map.put(J.charAt(i),0);
        }
        
        for(int i =0; i<S.length(); i++){
            if(map.containsKey(S.charAt(i))) map.put(S.charAt(i),map.get(S.charAt(i))+1);
        }
        
        if(map.size()==0 ) return 0;
        
        for(char c : map.keySet()) answer += map.get(c);
        
        return answer;
    */
}
