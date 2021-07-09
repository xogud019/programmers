package Programmers.level2;

import java.util.*;

public class MoreSpicy {
    public static void main(String[ ]args){
        int[] scoville ={1,1,1};
        int K = 9;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K){
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        while(true){
            if(pq.size()==1){
                return -1;
            }
            pq.add(pq.poll()+pq.poll()*2);
            answer++;
            if(pq.peek()>=K){
                break;
            }
        }

        return answer;
    }
}