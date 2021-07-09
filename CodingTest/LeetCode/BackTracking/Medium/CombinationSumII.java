package CodingTest.LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
*/
public class CombinationSumII {
    /*566ms
    Set<List<Integer>> answer;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        answer = new HashSet<>();
        
        Arrays.sort(candidates);
        
        backtracking(candidates, new ArrayList<>(), 0, target);
        
        return new ArrayList<>(answer);
    }
    
    public void backtracking(int[] arr, List<Integer> list, int idx, int target){
        if(target == 0){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        if(target < 0) return;
        
        if(idx == arr.length) return;
        
        for(int i=idx; i<arr.length; i++){
            list.add(arr[i]);
            backtracking(arr, list, i+1, target-arr[i]);
            list.remove(list.size()-1);
        }
    }
    */
    //4ms
    Set<List<Integer>> answer;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        answer = new HashSet<>();
        
        Arrays.sort(candidates);
        
        backtracking(candidates, new ArrayList<>(), 0, target);
        
        return new ArrayList<>(answer);
    }
    
    public void backtracking(int[] arr, List<Integer> list, int idx, int target){
        if(target == 0){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        if(target < 0) return;
        
        if(idx == arr.length) return;
        
        int prev = -1;
        
        for(int i=idx; i<arr.length; i++){
            if(prev != -1 && arr[prev] == arr[i]) continue;
            
            if(target - arr[i] >= 0){
                list.add(arr[i]);
                backtracking(arr, list, i+1, target-arr[i]);
                list.remove(list.size()-1);    
            }
            
            prev = i;
        }
    }
}
