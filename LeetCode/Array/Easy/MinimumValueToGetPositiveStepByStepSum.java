package LeetCode.Array.Easy;

public class MinimumValueToGetPositiveStepByStepSum {
    /*
    public int minStartValue(int[] nums) {
        int count = 1;
        
        while(true){
            int sV = count++;
            boolean isT = true;
            int answer = sV;
            
            for(int i:nums){
                sV+=i;
                
                if(sV<=0){
                    isT = false;
                    break;
                }
            }
            
            if(isT) return answer;
        }
    }
    */
    public int minStartValue(int[] nums) {
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        
        for(int i:nums){
            sum += i;
            answer = Math.min(sum,answer);
        }
        
        return answer>0? 1:Math.abs(answer)+1;
    }
}
