package CodingTest.LeetCode.Greedy.Easy;

import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:stones) pq.add(i);
        
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            
            if(y==x) continue;
            else{
                pq.add(y-x);
            }
        }
        
        return pq.size()==0? 0:pq.poll();
    }
}
