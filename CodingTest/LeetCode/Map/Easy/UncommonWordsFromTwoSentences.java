package CodingTest.LeetCode.Map.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        String[] answer;
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<a.length; i++) map.put(a[i], map.getOrDefault(a[i],0)+1);
        
        for(int i=0; i<b.length; i++) map.put(b[i], map.getOrDefault(b[i],0)+1);

        for(String s : map.keySet()){
            if(map.get(s) == 1) list.add(s);    
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
