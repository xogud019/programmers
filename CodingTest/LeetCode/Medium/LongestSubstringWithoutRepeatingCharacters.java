package CodingTest.LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

//sliding window
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int answer = 0;
        
        while(j<n&&i<n){
            char temp = s.charAt(j);
            if(!set.contains(temp)){
                set.add(temp);
                j++;
                answer = Math.max(answer,j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return answer;
    }
}