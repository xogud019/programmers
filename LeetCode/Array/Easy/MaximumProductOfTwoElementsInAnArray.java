package LeetCode.Array.Easy;

public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                answer = Math.max((nums[i]-1)*(nums[j]-1),answer);
            }
        }
        
        return answer;
    }
}
