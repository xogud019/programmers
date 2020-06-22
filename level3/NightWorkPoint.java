package level3;
import java.util.*;
//not
public class NightWorkPoint {
    public static void main(String[] args){
        int n = 4;
        int[] works = {4,3,3};
        System.out.println(solution(n, works));
    }

    public static long solution(int n, int[] works) {
        long answer = 0;
        int total =0;
        Integer[] work = new Integer[works.length];
        copy(works, work);
        Arrays.sort(work,Collections.reverseOrder());
        copy(work, works);
        for(int i=0; i<works.length; i++){
            total+=works[i];
        }

        if(n>=total){
            return 0;
        }
        for(int i=0; i<n; i++){
            works[i%works.length]--;
        }

        for(int i=0; i<works.length; i++){
            answer+=Math.pow((long)works[i], 2);
        }
        return answer;
    }

    public static void copy(int[] works, Integer[] work){
        for(int i=0; i<works.length; i++){
            work[i]= works[i];
        }
    }

    public static void copy(Integer[] work, int[] works){
        for(int i=0; i<work.length; i++){
            works[i]= work[i];
        }
    }
}