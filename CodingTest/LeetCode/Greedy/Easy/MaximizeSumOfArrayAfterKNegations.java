package CodingTest.LeetCode.Greedy.Easy;

import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int i:A) pq.add(i);
        
        while(K>0){
            pq.add(pq.poll()*(-1));
            K--;
        }
        
        while(!pq.isEmpty()) answer += pq.poll();
        
        return answer;
    }
}
