package CodingTest.Programmers.level1;

import java.util.*;

public class ReverseN {
    public static void main(String[] args){
        long n = 12345;
        int[] result = solution(n);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(long n){
        int[] result={};
        List<Long> list = new ArrayList<>();

        while(n!=0){
            list.add(n%10);
            n/=10;
        }
        result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i]=(int)(long)list.get(i);
        }

        return result;
    }
}