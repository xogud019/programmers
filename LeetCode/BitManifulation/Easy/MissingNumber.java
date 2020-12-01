package LeetCode.BitManifulation.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int num = 0;
        
        for(int i=0; i<=n; i++) num ^= i;
        
        for(int i:nums) num ^= i;
        
        return num;
    }
    /*
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    */
}
