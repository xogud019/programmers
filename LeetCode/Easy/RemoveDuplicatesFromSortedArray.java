package LeetCode.Easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[len]!=nums[i]){
                nums[++len] = nums[i];
            }
        }
        
        return len+1;
    }
}
