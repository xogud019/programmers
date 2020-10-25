package LeetCode.String.Easy;

import java.util.*;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<paths.size(); i++){
            map.put(paths.get(i).get(0), map.getOrDefault(paths.get(i).get(0),0)+1);
            map.put(paths.get(i).get(1), map.getOrDefault(paths.get(i).get(1),0)-1);
        }
        
        for(String k : map.keySet()){
            if(map.get(k)== -1) answer = k;
        }
        return answer;
    }
}
