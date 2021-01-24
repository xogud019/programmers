package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:
1.1 <= nums.length <= 6
2.-10 <= nums[i] <= 10
3.All the integers of nums are unique.
*/
public class Permutations {
    static List<List<Integer>> answer;
    
    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        perm(nums, new ArrayList<>(), visited);
        
        return answer;
    }
    
    public void perm(int[] nums, List<Integer> list, boolean[] visited){
        if(list.size() == nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                perm(nums, list, visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
        
    }
}
