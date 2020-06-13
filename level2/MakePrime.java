package level2;
import java.util.*;

public class MakePrime {
    static int answer;
    static int r = 3;
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }   
    
    public static int solution(int[] nums){
        answer = combi(4,3);
        int[] arr = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        return answer;
    }

    

    public static int combi(int n, int r){
        if(r==0){
            return 1;
        }
        else if(n<r){
            return 0;
        }
        return combi(n-1,r-1)+combi(n-1,r);
    }
}