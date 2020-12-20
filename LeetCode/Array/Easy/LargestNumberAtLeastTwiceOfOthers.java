package LeetCode.Array.Easy;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = 0, idx = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max =nums[i];
                idx = i;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i==idx) continue;
            
            if(max < nums[i]*2) return -1;
        }
        
        return idx;
    }
}
