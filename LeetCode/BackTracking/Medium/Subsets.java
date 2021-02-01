package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
*/
public class Subsets {
    //backtracking
    List<List<Integer>> answer;
    
    public List<List<Integer>> subsets(int[] nums) {
        answer = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        backtracking(nums, new ArrayList<>(), visited, 0);
        
        return answer;
    }
    
    public void backtracking(int[] nums, List<Integer> list, boolean[] visited, int start){
        answer.add(new ArrayList<>(list));
        
        for(int i=start; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                backtracking(nums, list, visited, i+1);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }

    /*bit
    List<List<Integer>> answer;

    public List<List<Integer>> subsets(int[] nums) {
        answer = new ArrayList<>();
        int len = nums.length;
        List<Integer> list;
        
        for(int i=0; i<1<<len; i++){
            list = new ArrayList<>();
            
            for(int j=0; j<len; j++){
                if((i&(1<<j))!=0) list.add(nums[j]);
            }
            
            answer.add(new ArrayList<>(list));
        }        
        
        return answer;
    }
    */
}
