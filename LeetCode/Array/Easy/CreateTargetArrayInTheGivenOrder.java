package LeetCode.Array.Easy;

import java.util.*;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] answer = new int[nums.length];
        
        Arrays.fill(answer,-1);
        
        for(int i=0; i<nums.length; i++){
            if(answer[index[i]]== -1) answer[index[i]] = nums[i];
            
            else{
                for(int j=nums.length-1; j>index[i]; j--){
                    answer[j] = answer[j-1];
                }
                answer[index[i]] = nums[i];
            }    
        }
        
        return answer;
    }
}
