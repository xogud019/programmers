package CodingTest.Programmers.level3;

import java.util.*;
//not
public class LineUp{
    static List<String> list = new ArrayList<>();    
    public static void main(String[] args){
        int n = 20;
        long k = 5;
        int[] result = solution(n, k);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }

    public static int[] solution(int n, long k){
        int[] result = {};
        long total = fac(n);
        System.out.println(total/n);
        return result;
    }

    public static long fac(int n){
        long answer = 1;

        for(int i =n; i>1; i--){
            answer*=i;
        }

        return  answer;
    }
}