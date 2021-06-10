package LeetCode.Map.Easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        String[] answer;
        
        for(String s:words){
            String temp = s.toLowerCase();
            char idx = temp.charAt(0);
            
            if(row1.indexOf(idx) != -1){
                int count = 0;
                
                for(int i=0; i<temp.length(); i++){
                    if(row1.indexOf(temp.charAt(i))== -1) count++;
                }
                
                if(count == 0) list.add(s);
            }
            else if(row2.indexOf(idx) != -1){
                int count = 0;
                
                for(int i=0; i<temp.length(); i++){
                    if(row2.indexOf(temp.charAt(i))== -1) count++;
                }
                
                if(count == 0) list.add(s);
            }
            else{
                int count = 0;
                
                for(int i=0; i<temp.length(); i++){
                    if(row3.indexOf(temp.charAt(i))== -1) count++;
                }
                
                if(count == 0) list.add(s);
            }
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
