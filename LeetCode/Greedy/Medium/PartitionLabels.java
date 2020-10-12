package LeetCode.Greedy.Medium;

import java.util.*;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] dic = new int[26];
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<S.length(); i++){
            dic[S.charAt(i)-'a'] = i;
        }
        
        int index = 0;
        int start = 0;
        
        for(int i=0; i<S.length(); i++){
            index = Math.max(index, dic[S.charAt(i)-'a']);
            
            if(index == i){
                answer.add(index-start+1);
                start = i+1;
            }
        }
        
        return answer;
    }
}
