package LeetCode.String.Easy;

import java.util.*;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        
        for(String s:words){
            String word = "";
            
            for(int i=0; i<s.length(); i++) word += morse[s.charAt(i)-'a'];    
            
            set.add(word);
        }
        
        return set.size();
    }
}
