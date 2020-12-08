package LeetCode.Array.Easy;

import java.util.Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int total = Arrays.stream(A).sum();
    
        if(total%3 != 0) return false;
        
        total /= 3;
        
        int sum = 0, count = 0;
        
        for(int i:A){
            sum += i;
            
            if(sum==total){
                sum = 0;
                count++;
            }
        }
        
        return count >= 3 ? true:false;
    }
}
