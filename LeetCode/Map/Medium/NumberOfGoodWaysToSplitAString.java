package LeetCode.Map.Medium;

import java.util.HashMap;
/*
You are given a string s, a split is called good if you can split s into 2 non-empty strings p and q where its concatenation is equal to s and the number of distinct letters in p and q are the same.

Return the number of good splits you can make in s.

 

Example 1:

Input: s = "aacaba"
Output: 2
Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.

Example 2:

Input: s = "abcd"
Output: 1
Explanation: Split the string as follows ("ab", "cd").

Example 3:

Input: s = "aaaaa"
Output: 4
Explanation: All possible splits are good.

Example 4:

Input: s = "acbadbaada"
Output: 2
 

Constraints:
1.s contains only lowercase English letters.
2.1 <= s.length <= 10^5
*/
public class NumberOfGoodWaysToSplitAString {
    /*time out
    public int numSplits(String s) {
        HashMap<Character, Integer> map1, map2;
        int answer = 0;
        
        for(int i=1; i<s.length(); i++){
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            
            String a = s.substring(0,i);
            String b = s.substring(i,s.length());
                        
            for(char c:a.toCharArray()){
                if(!map1.containsKey(c)) map1.put(c,1);
            }
            
            for(char c:b.toCharArray()){
                if(!map2.containsKey(c)) map2.put(c,1);
            }
            
            if(map1.size() == map2.size()) answer++;
        }
        
        return answer;
    }
    */
    public int numSplits(String s) {
        int answer = 0;
        HashMap<Character, Integer> left = new HashMap<>(), right = new HashMap<>();
        
        for(char c:s.toCharArray()) right.put(c, right.getOrDefault(c,0)+1);
        
        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            left.put(c, left.getOrDefault(c, 0)+1);
            
            right.put(c, right.get(c)-1);
            if(right.get(c)==0) right.remove(c);
            
            if(left.size() == right.size()) answer++;
        }
        
        return answer;
    }
}
