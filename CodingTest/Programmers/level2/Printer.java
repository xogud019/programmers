package CodingTest.Programmers.level2;

import java.util.*;

public class Printer {
    public static void main(String[] args){
        int[] priorities={2,1,3,2};
        int location = 2;
        //char c = 'A';
        //System.out.println((char)((int)c+1));
        System.out.println(solution(priorities, location));
    }   
    
    public static int solution(int[] priorities, int location){
        int answer= 1;
        int n = priorities.length;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=priorities[i];
        }
        Arrays.sort(arr);
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=n-1; i>=0; i--){
            q.add(arr[i]);
        }
        
        while(!q.isEmpty()){
            for(int i=0; i<n; i++){
                if(priorities[i]==q.peek()){
                    if(i==location){
                        return answer;
                    }
                    q.poll();
                    answer++;
                }
            }
        }
        return answer;
    
    }
    
       /*
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
    */
}