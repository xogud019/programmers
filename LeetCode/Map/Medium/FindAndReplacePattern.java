package LeetCode.Map.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
You have a list of words and a pattern, and you want to know which words in words matches the pattern.
A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
Return a list of the words in words that match the given pattern. 
You may return the answer in any order.

Example 1:

Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.
 

Note:
1.1 <= words.length <= 50
2.1 <= pattern.length = words[i].length <= 20
*/
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        
        for(String word:words){
            if(match(word,pattern)) answer.add(word);
        }
        
        return answer;
    }
    
    public boolean match(String word, String pattern){
        HashMap<Character, Character> map1 = new HashMap<>(), map2 = new HashMap<>();
        
        for(int i=0; i<word.length(); i++){
            char v1 = word.charAt(i);
            char v2 = pattern.charAt(i);
            
            if(!map1.containsKey(v1)) map1.put(v1,v2);
            if(!map2.containsKey(v2)) map2.put(v2,v1);
            if(map1.get(v1) != v2 || map2.get(v2) != v1) return false;
        }
        
        return true;
    }

    /*
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        
        if(pattern.length() == 1){
            for(String word : words){
                if(word.length() == 1) answer.add(word);
            }
            
            return answer;
        }
        
        HashMap<Character, Character> map1, map2;
        boolean same;
        
        for(String word : words){
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            same = true;
            
            for(int i=0; i<word.length(); i++){
                char c1 = word.charAt(i), c2 = pattern.charAt(i);
                
                if(!map1.containsKey(c1)) map1.put(c1, c2);
                else{
                    if(map1.get(c1) != c2){
                        same = false;
                        break;
                    }
                }
                if(!map2.containsKey(c2)) map2.put(c2, c1);
                else{
                    if(map2.get(c2) != c1){
                        same = false;
                        break;
                    }
                }
            }
            
            if(same) answer.add(word);
        }
        
        return answer;
    }
    */
}
