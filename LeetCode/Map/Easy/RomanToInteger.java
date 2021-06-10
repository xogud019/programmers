package LeetCode.Map.Easy;

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
    /*forward
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            
            if(i+1<s.length() && map.get(temp)<map.get(s.charAt(i+1))){
                answer += (map.get(s.charAt(i+1))-map.get(temp));
                i++;
                continue;
            }
            
            answer += map.get(temp);
        }
        //backward
        for(int i=s.length()-1; i>=0; i--){
            char temp = s.charAt(i);
            
            if(i-1 >=0 && map.get(s.charAt(i-1))<map.get(temp)){
                answer += (map.get(temp)-map.get(s.charAt(i-1)));
                i--;
                continue;
            }
            
            answer += map.get(temp);
        }
        return answer;
        
        return answer;
    }
    */
}
