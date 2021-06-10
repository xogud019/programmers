package LeetCode.Map.Easy;

import java.util.HashMap;
/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", s = "dog dog dog dog"
Output: false
 

Constraints:

1.1 <= pattern.length <= 300
2.pattern contains only lower-case English letters.
3.1 <= s.length <= 3000
4.s contains only lower-case English letters and spaces ' '.
5.s does not contain any leading or trailing spaces.
6.All the words in s are separated by a single space.
*/
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map1 = new HashMap<>();
        HashMap<Character,String> map2 = new HashMap<>();
        String[] word = s.split(" ");
        
        if(pattern.length() != word.length) return false;
        
        for(int i=0; i<word.length; i++){
            char c = pattern.charAt(i);
            String w = word[i];
            
            if(!map2.containsKey(c)){
                if(map1.containsKey(w)) return false;
                else{
                    map1.put(w,c);
                    map2.put(c,w);
                }
            }
            else{
                if(!map2.get(c).equals(w)) return false;
            }
        }
        
        return true;
    }
}
