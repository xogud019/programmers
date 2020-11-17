package LeetCode.Hash.Easy;

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int max = candies.length/2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:candies) set.add(i);
        
        if(set.size()>max) return max;
        else return set.size();
    }
}
