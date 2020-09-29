package LeetCode.Easy;
import java.util.*;

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i])-1;
            
            if(nums[val]>0) nums[val] = -nums[val];
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) answer.add(i+1);
        }
        
        return answer;
    }
}
