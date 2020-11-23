package LeetCode.String.Easy;

import java.util.HashMap;

public class RomanToInteger {
    static HashMap<Character, Integer> map = new HashMap<>();
    static {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    };
    
    public int romanToInt(String s) {
        int answer = 0;
        int len = s.length();
        if(len == 1) return map.get(s.charAt(0));
        
        for(int i=len-1; i>0; i--){
            int cur = map.get(s.charAt(i));
            int pre = map.get(s.charAt(i-1));
            
            answer += cur;
            //System.out.println(answer);
            if(pre < cur){
                answer -= pre;
                i--;
            }
        }
        
        if(map.get(s.charAt(0)) >= map.get(s.charAt(1))) answer += map.get(s.charAt(0));
        
        return answer;   
    }
}
