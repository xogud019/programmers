package LeetCode.Greedy.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<groupSizes.length; i++){
            int size = groupSizes[i];
            List<Integer> tmp = new ArrayList<>();
            
            if(map.containsKey(size)) tmp = map.get(size);
            
            tmp.add(i);
            map.put(size,tmp);
            
            if(tmp.size()==size){
                answer.add(tmp);
                map.remove(size);
            }
        }
        
        
        return answer;
    }
}
