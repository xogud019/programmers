package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]>min) continue;
            
            if(arr[i]-arr[i-1]<min){
                min = arr[i] - arr[i-1];
                answer.clear();
            }
            
            temp = new ArrayList<>();
            temp.add(arr[i-1]);
            temp.add(arr[i]);
            answer.add(temp);
            
        }
        return answer;
    }
}
