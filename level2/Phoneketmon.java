package level2;
import java.util.*;

public class Phoneketmon {
    public static void main(String[] args){
        int[] nums = {3,3,3,2,2,4};
        System.out.println(solution(nums));
    }    

    public static int solution(int[] nums){
        List<Integer> list = new ArrayList<>();
        int max = nums.length/2;
        
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            if(list.size()==max){
                return list.size();
            }
        }

        return list.size();
    }
}