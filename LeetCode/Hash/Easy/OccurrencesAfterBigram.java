package LeetCode.Hash.Easy;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> list = new ArrayList<>();
        String[] answer;
        
        for(int i=0; i<arr.length-2; i++){
            if(arr[i].equals(first) &&arr[i+1].equals(second)) list.add(arr[i+2]);
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        
        
        return answer;
    }
}
