package CodingTest.LeetCode.Greedy.Easy;

import java.util.*;

public class MinimumSubsequenceInNonIncreasingOrder{
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int max = 0;
        int inc = 0;
        
        Arrays.sort(nums);
        
        for(int i : nums){
            answer.add(i);
            max += i;
        }
        
        if(answer.size()==1) return answer;
        
        while(answer.size()>0){
            inc += answer.get(0);
            max -= answer.get(0);
            
            if(inc>=max) break;
            else answer.remove(0);
        }
        
        Collections.sort(answer, Collections.reverseOrder());
        return answer;
    }
}