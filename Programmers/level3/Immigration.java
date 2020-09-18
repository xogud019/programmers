package Programmers.level3;

import java.util.*;

public class Immigration {
    public static void main(String[] args){
        int n  =6;
        int[] times = {7,10};
        System.out.println(solution(n, times));
    }

    public static long solution(int n, int[] times){
        Arrays.sort(times);
        int len = times.length;
        long min =0;
        long max = (long)times[len-1]*(long)n;
        long answer = max;
        long mid = 0;
        long total = 0;

        while(min<=max){
            total = 0;
            mid = (min+max)/2;

            for(int i=0; i<times.length; ++i){
                total += mid/times[i];
            }

            if(total>=n){
                if(mid<answer){
                    answer = mid;
                }
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return answer;
    }
}