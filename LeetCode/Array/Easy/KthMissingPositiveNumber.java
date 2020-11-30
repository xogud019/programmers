package LeetCode.Array.Easy;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int idx = 0, idy = 0, val = 1;
        
        while(idx<arr.length){
            if(arr[idx] != val){
                idy++;
                
                if(idy == k) return val;
                
                val++;
            }
            else{
                idx++;
                val++;
            }
        }
        
        return arr.length+k;
    }
}
