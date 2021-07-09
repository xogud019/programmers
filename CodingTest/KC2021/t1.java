package CodingTest.KC2021;

import java.util.HashMap;

public class t1 {
    public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i:wants) map.put(i, map.getOrDefault(i, 0) +1);
        
        for(int i:gift_cards){
            if(map.containsKey(i)){
                if(map.get(i)!=0) map.put(i, map.get(i)-1);
            }
        }
        
        for(int i:map.keySet()){
            if(map.get(i) != 0) answer += map.get(i);
        }
        
        return answer;
    }
}
