package CodingTest.Programmers.level2;

import java.util.*;

public class FunctionDev {
    public static void main(String[] args){
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        int[] result = solution(progresses, speeds);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int temp=0;
        int count=1;
        Queue<Integer> work_time = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<speeds.length; i++){
            for(int j=1;;j++){
                if(progresses[i]+speeds[i]*j>=100){
                    work_time.add(j);
                    break;
                }
            }
        }
        
        while(!work_time.isEmpty()){
            if(temp==0){
                temp= work_time.poll();
            }

            if(temp>=work_time.peek()){
                work_time.poll();
                count++;
            }
            else{
                temp=work_time.poll();
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        answer= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
       
        return answer;
    }
    
}