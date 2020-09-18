package Programmers.level3;

import java.util.*;
//not
public class WallInspection {
    public static void main(String[] args){
        int n = 12;
        int[] weak ={1,5,6,10};
        int[] dist ={1,2,3,4};

        System.out.println(solution(n, weak, dist));
    } 

    public static int solution(int n, int[] weak, int[] dist){
        int answer = 0;
        return answer;
    }

    public static void dfs(int[] dist, int index){
        if(index ==dist.length){
            return;
        }

        for(int i=0; i<index+1; i++){
            
        }
    }
}  