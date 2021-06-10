package LeetCode.Map.Easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i: nums) set.add(i);
        
        return set.size() != nums.length; 
    }
}
