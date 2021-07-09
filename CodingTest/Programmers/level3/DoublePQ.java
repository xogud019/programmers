package CodingTest.Programmers.level3;

import java.util.*;

public class DoublePQ{
    public static void main(String[] args){
        String[] operations = {"I -45","I 653","D 1","I -642","I 45","I 97","D 1","D -1","I 333"};
        int[] result = solution(operations);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }

    public static int[] solution(String[] operations){
        int[] answer = new int[2];
        Queue<Integer> minQ = new PriorityQueue<>();
        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<operations.length; i++){
            String[] s = operations[i].split(" ");
            if(s[0].equals("I")){
                minQ.add(Integer.parseInt(s[1]));
                maxQ.add(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("D")){
                if(minQ.isEmpty()){
                    continue;
                }
                else if(Integer.parseInt(s[1])==-1){
                    maxQ.remove(minQ.peek());
                    minQ.poll();
                }
                else if(Integer.parseInt(s[1])==1){
                    minQ.remove(maxQ.peek());
                    maxQ.poll();
                }
            }
        }

        if(minQ.isEmpty()){
            return answer;
        }
        else if(minQ.size()==1){
            answer[0] =minQ.poll();
        }
        else{
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }

        return answer;
    }
}