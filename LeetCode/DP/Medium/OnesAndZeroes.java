package LeetCode.DP.Medium;
/*
You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.

A set x is a subset of a set y if all elements of x are also elements of y.

 

Example 1:

Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
Output: 4
Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
Example 2:

Input: strs = ["10","0","1"], m = 1, n = 1
Output: 2
Explanation: The largest subset is {"0", "1"}, so the answer is 2.
 

Constraints:

1 <= strs.length <= 600
1 <= strs[i].length <= 100
strs[i] consists only of digits '0' and '1'.
1 <= m, n <= 100
*/
public class OnesAndZeroes{
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        int answer = 0;
        
        for(String str : strs){
            int zero = str.length()-str.replaceAll("0","").length();
            int one = str.length()-str.replaceAll("1","").length();
            
            for(int i=m; i>=zero; i--){
                for(int j=n; j>=one; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zero][j-one]+1);
                    answer = Math.max(answer, dp[i][j]);
                }
            }
            /*
            for(int[] i: dp){
                for(int j:i) System.out.print(j+" ");
                System.out.println();
            }
            System.out.println();
            */
        }
        
        return answer;
    }
    /*
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        //m = 0, n = 1
        for(String s:strs){
            int[] nums = counting(s);
            
            for(int i=m; i >= 0; i--){
                for(int j=n; j >= 0; j--){
                    if(i >= nums[0] && j >= nums[1]) dp[i][j] = Math.max(dp[i][j], dp[i-nums[0]][j-nums[1]]+1);
                }
            }
        }
               
        //print(dp);
        return dp[m][n];
    }
    
    public void print(int[][] dp){
        for(int[] i:dp){
            for(int j:i) System.out.print(j+" ");
            System.out.println();
        }
    }
    
    public int[] counting(String s){
        int[] arr = new int[2];
        
        for(char c:s.toCharArray()){
            if(c == '1') arr[1]++;
            else arr[0]++;
        }
        
        return arr;
    }
    */
}