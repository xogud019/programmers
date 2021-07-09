package CodingTest.LeetCode.Array.Easy;

public class FindPivotIndex {
    /* back-way casue an error
    public int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        int pivot = nums.length-1;
        
        for(int i=0; i<nums.length-1; i++){
            left += nums[i];
        }
        
        while(pivot>=0){
            if(left==right) return pivot;
            right += nums[pivot];
            pivot--;
            if(pivot >= 0) left -= nums[pivot];
            else left = 0;
        }
        
        return -1;
    }
    */
    public int pivotIndex(int[] nums) {
        int sum = 0, left = 0;
        
        for(int i:nums) sum += i;
        for(int i=0; i<nums.length; i++){
            if(left == sum-left-nums[i]) return i;
            
            left += nums[i];
        }
        
        return -1;
    }
}
