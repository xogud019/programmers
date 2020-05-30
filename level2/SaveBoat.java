package level2;
import java.util.*;

public class SaveBoat {
    public static void main(String[] args){
        int[] people = {40,80,50,60};
        int limit = 120;
        System.out.println(solution(people,limit));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        int tot_wei = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<people.length; i++){
            q.add(people[i]);
        }
        
        while(!q.isEmpty()){
            tot_wei = q.poll();

            int count = 0;
            while(count<q.size()){
                if(tot_wei+q.peek()<=limit){
                    tot_wei+=q.poll();
                    break;
                }
                else{
                    System.out.println(q.peek());
            
                    int n = q.poll();
                    q.add(n);
                    count++;
                }
            }

            answer++;
            tot_wei = 0;
        }


        return answer;
    }
}