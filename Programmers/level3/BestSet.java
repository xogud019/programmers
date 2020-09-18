package Programmers.level3;

import java.util.*;

public class BestSet {
    public static void main(String[] args){
        int n = 2;
        int s = 9;
        int[] result = solution(n, s);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]+" ");
        }
    }   

    public static int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(n>s){
            return new int[]{-1};
        }

        for(int i=0; i<n; i++){
            answer[i]=s/n;
        }

        for(int i=0; i<s%n; i++){
            answer[i]++;
        }

        Arrays.sort(answer);
        return answer;
    }
}