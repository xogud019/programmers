package LeetCode.DP.Hard;
/*
Given an m x n matrix matrix and an integer k, return the max sum of a rectangle in the matrix such that its sum is no larger than k.

It is guaranteed that there will be a rectangle with a sum no larger than k.

 

Example 1:


Input: matrix = [[1,0,1],[0,-2,3]], k = 2
Output: 2
Explanation: Because the sum of the blue rectangle [[0, 1], [-2, 3]] is 2, and 2 is the max number no larger than k (k = 2).
Example 2:

Input: matrix = [[2,2,-1]], k = 3
Output: 3
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-100 <= matrix[i][j] <= 100
-105 <= k <= 105
*/
public class MaxSumOfRectangleNoLargerThanK {
    //brute force & dp 386ms
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                dp[i][j] += dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i-1][j-1];
            }
        }
        /*
        for(int[] i:dp){
            for(int j:i) System.out.print(j+" ");
            System.out.println();
        }
        */
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                for(int r=0; r<i; r++){
                    for(int c=0; c<j; c++){
                        int num = dp[i][j] - dp[r][j] - dp[i][c] + dp[r][c];
                        
                        if(num > max && num <= k) max = num;
                    }
                }
            }
        }
        
        return max;
    }
}
