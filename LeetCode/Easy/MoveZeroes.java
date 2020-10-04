package LeetCode.Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        
        for(int i:nums){
            if(i!=0){
                arr[idx++] = i;
            }    
        }
        
        for(int i=idx; i<arr.length; i++){
            arr[i] = 0;
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
    /*
    int idx = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }    
        }
    */
}
