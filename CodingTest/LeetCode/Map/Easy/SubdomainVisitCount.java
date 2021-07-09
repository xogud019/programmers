package CodingTest.LeetCode.Map.Easy;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        
        for(String s:cpdomains){
            String[] count = s.split(" ");
            String[] addr = count[1].split("\\.");
            //System.out.println(count[0]+" "+count[1]);
            String temp = "";
            
            for(int i=addr.length-1; i>=0; i--){
                //System.out.println(addr[i]);
                if(temp.length()==0) temp = addr[i]+temp;
                else temp = addr[i]+"."+temp;
                
                //System.out.println(temp);
                map.put(temp, map.getOrDefault(temp,0)+Integer.parseInt(count[0]));
            }
        }
        
        for(String s:map.keySet()){
            String temp = map.get(s)+" "+s;
            answer.add(temp);
        }
        
        return answer;
    }
}
