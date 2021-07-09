package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> answer = new ArrayList<>();
        
        for(int i:candies){
            max = Math.max(max,i);
        }
        
        for(int i:candies){
            if(i+extraCandies >= max) answer.add(true);
            else answer.add(false);
        }
        
        return answer;
    }
}
