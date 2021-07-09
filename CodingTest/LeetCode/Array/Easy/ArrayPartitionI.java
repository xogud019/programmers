package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i+=2){
            answer += Math.min(nums[i],nums[i+1]);
        }
        
        return answer;
    }
}
