package level2;
import java.util.*;

public class Printer {
    public static void main(String[] args){
        int[] priorities={1,1,9,1,1,1};
        int location = 0;
        //char c = 'A';
        //System.out.println((char)((int)c+1));
        System.out.println(solution(priorities, location));
    }   
    
    public static int solution(int[] priorities, int location){
        int answer= 1;
        int n = priorities.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<n; i++){
            pq.add(priorities[i]);
        }

        while(!pq.isEmpty()){
            for(int i=0; i<n; i++){
                if(priorities[i]==pq.peek()){
                    if(i==location){
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}