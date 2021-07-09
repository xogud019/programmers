package CodingTest.LeetCode.Map.Easy;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0, odd = 0, count = 0, total = 0;
        
        for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
        for(char c:map.keySet()){
            if(map.get(c)%2==0) answer += map.get(c);
            else{
                odd = Math.max(odd,map.get(c));
                total += map.get(c);
                count++;
            }
        }
        
        if(count == 0) return answer;
        else return answer+total-count+1;
    }
}
