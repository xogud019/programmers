package LeetCode.Array.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int count = 0;
        
        for(int i:nums){
            if(i==1) count++;
            else{
                answer = Math.max(answer,count);
                count = 0;
            }
        }
        
        if(count != 0) answer = Math.max(answer, count);
        
        return answer;
    }
}
