package CodingTest.Programmers.level1;

import java.util.*;

public class NoSameNum {
    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer= solution(arr);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public static int[] solution(int []arr) {
        int[] answer = {};
        int index=0;
        List<Integer> list =new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(list.get(index)!=arr[i]){
                list.add(arr[i]);
                index++;
            }
        }
        
        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}