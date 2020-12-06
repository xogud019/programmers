package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroupsEasy {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0, end = 0;
        ArrayList<List<Integer>> answer = new ArrayList<>();
        char base = s.charAt(0);
        int count = 1;
        
        for(int i=1; i<s.length(); i++){
            if(base == s.charAt(i)) count++;
            else{
                end = i-1;
                if(count>=3) answer.add(new ArrayList<>(Arrays.asList(start,end)));
                
                count = 1;
                start = i;
                end = 0;
                base = s.charAt(i);
            }
        }
        
        if(count>2) answer.add(new ArrayList<>(Arrays.asList(start,s.length()-1)));
        
        return answer;
    }
}
