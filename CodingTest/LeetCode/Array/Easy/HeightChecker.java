package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int answer = 0;
        int[] arr = heights.clone();
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=heights[i]) answer++;
        }
        
        return answer;
    }
}
