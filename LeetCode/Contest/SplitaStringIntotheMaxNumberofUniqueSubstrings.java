package LeetCode.Contest;
import java.util.*;
//failed case
public class SplitaStringIntotheMaxNumberofUniqueSubstrings {
    public int maxUniqueSplit(String s) {
        List<String> list = new ArrayList<>();
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            String temp = Character.toString(s.charAt(i));
            
            if(!list.contains(temp)) list.add(temp);
            else{
                while(list.contains(temp)){
                    i += 1;
                    if(i==s.length()) break;
                    temp += s.charAt(i);
                }
                
                if(!list.contains(temp)) list.add(temp);
            }
            
        }
        
        answer = Math.max(list.size(),answer);
        list.clear();
        
        for(int i=s.length()-1; i>=0; i--){
            String temp = Character.toString(s.charAt(i));
            
            if(!list.contains(temp)) list.add(temp);
            else{
                while(list.contains(temp)){
                    i -= 1;
                    if(i==-1) break;
                    temp += s.charAt(i);
                }
                
                if(!list.contains(temp)) list.add(temp);
            }
            
        }
        
        answer = Math.max(answer, list.size());
        return answer;
    }
}
