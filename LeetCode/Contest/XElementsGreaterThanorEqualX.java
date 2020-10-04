package LeetCode.Contest;

public class XElementsGreaterThanorEqualX {
    public int specialArray(int[] nums) {
        
        for(int i=0; i<=nums.length; i++){
            int count = 0;
            for(int j:nums){
                if(j>=i) count++;
            }
            
            if(count==i) return i;
        }
        
        return -1;
    }
}
