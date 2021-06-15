package LeetCode.DFS.Medium;

import java.util.Arrays;
/*
You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.

Return true if you can make this square and false otherwise.

 

Example 1:


Input: matchsticks = [1,1,2,2,2]
Output: true
Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
Example 2:

Input: matchsticks = [3,3,3,3,4]
Output: false
Explanation: You cannot find a way to form a square with all the matchsticks.
 

Constraints:

1 <= matchsticks.length <= 15
0 <= matchsticks[i] <= 109
*/
public class MatchsticksToSquare{
    /*failed case - time out
    make 0 to side
    int len, n;
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        n = matchsticks.length;
        
        for(int i:matchsticks) sum += i;
        
        if(sum%4 != 0) return false;
        
        len = sum/4;
        
        Arrays.sort(matchsticks);
        
        if(len < matchsticks[n-1]) return false;
        
        return dfs(new int[]{0,0,0,0}, matchsticks, 0);
    }
    
    public boolean dfs(int[] arr, int[] nums, int idx){
        if(idx == n){
            return arr[0] == len && arr[1] == len && arr[2] == len && arr[3] == len;
        }
        
        for(int i=0; i<4; i++){
            if(arr[i] >= len) continue;
            arr[i] += nums[idx];
            if(dfs(arr, nums, idx+1)) return true;
            arr[i] -= nums[idx];
        }
        
        return false;
    }
    */
    //side to 0 -> is done. why?
    int len, n;
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        n = matchsticks.length;
        
        for(int i:matchsticks) sum += i;
        
        if(sum%4 != 0) return false;
        
        len = sum/4;
        
        Arrays.sort(matchsticks);
        
        if(len < matchsticks[n-1]) return false;
        
        return dfs(new int[]{len, len, len, len}, matchsticks, n-1);
    }
    
    public boolean dfs(int[] arr, int[] nums, int idx){
        if(idx < 0){
            return arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0;
        }
        
        for(int i=0; i<4; i++){
            if(arr[i] < nums[idx]) continue;
            arr[i] -= nums[idx];
            if(dfs(arr, nums, idx-1)) return true;
            arr[i] += nums[idx];
        }
        
        return false;
    }
}