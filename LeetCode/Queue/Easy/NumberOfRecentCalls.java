package LeetCode.Queue.Easy;

import java.util.*;

public class NumberOfRecentCalls {
    class RecentCounter {
        List<Integer> list;
        
        public RecentCounter() {
            list = new ArrayList<>();    
        }
        
        public int ping(int t) {
            list.add(t);
            int answer = 0;
            
            for(int i : list){
                if(i>=t-3000 && i <= t) answer++;    
            }
            
            return answer;
        }
    }
}
