package LeetCode.Map.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        String[] answer;
        
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    int idx = i+j;
                    min = Math.min(min,idx);
                    
                    if(map.containsKey(idx)) map.get(idx).add(list1[i]);
                    else{
                        map.put(idx,new ArrayList<String>(Arrays.asList(list1[i])));
                    }
                }
            }
        }
        
        answer = new String[map.get(min).size()];
        
        return map.get(min).toArray(answer);
    }
}
