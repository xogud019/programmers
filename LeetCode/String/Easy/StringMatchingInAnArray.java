package LeetCode.String.Easy;

import java.util.*;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i==j) continue;
                
                if(words[i].contains(words[j])){
                    if(!answer.contains(words[j])) answer.add(words[j]);
                }
            }    
        }
        
        return answer;
    }
}
