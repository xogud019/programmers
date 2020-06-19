package level3;
import java.util.*;

public class DoublePQ{
    public static void main(String[] args){
        String[] operations = {"I 16","I -5643","D -1","D 1","D 1","I 123","D -1"};
        int[] result = solution(operations);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }

    public static int[] solution(String[] operations){
        int[] answer = new int[2];
        Queue<Integer> pq = new PriorityQueue<>();
        Deque<Integer> q = new ArrayDeque();

        for(int i=0; i<operations.length; i++){
            String[] s = operations[i].split(" ");
            if(s[0].equals("I")){
                pq.add(Integer.parseInt(s[1]));
            }
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        return answer;
    }
}