package LeetCode.Array.Easy;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[i] = nums[i];
        }
        
        for(int i=n; i<2*n; i++){
            y[i-n] = nums[i];
        }
        
        int idx = 0;
        
        for(int i=0; i<n; i++){
            nums[idx++] = x[i];
            nums[idx++] = y[i];
        }
        
        return nums;
    }
}
