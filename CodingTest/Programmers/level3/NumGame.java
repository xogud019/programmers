package Programmers.level3;

import java.util.*;

public class NumGame {
    public static void main(String[] args){
        int[] A = {5,1,3,7};
        int[] B = {2,2,6,8};
        System.out.println(solution(A,B));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=A.length-1, j =B.length-1; i>=0; i--){
            if(A[i]<B[j]){
                B[j]=0;
                answer++;
                j--;
            }
        }
        return answer;
    }
}
/*
for(int j=0; j<B.length; j++){
    if(A[i]<B[j]){
        B[j]=0;
        answer++;
        break;
    }
}*/