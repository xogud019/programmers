package CodingTest.Programmers.level3;

import java.util.*;

public class Scale {
    public static void main(String[] args){
        int[] weight = {3, 1, 6, 2, 7, 30, 1};
        System.out.println(solution(weight));
    }
    //1,1,2,3,6,7,30
    public static int solution(int[] weight){
        int answer = 1;
        Arrays.sort(weight);

        for(int i=0; i<weight.length; i++){
            if(weight[i]>answer){
                break;
            }
            answer+=weight[i];
        }
        return answer;
    }
}