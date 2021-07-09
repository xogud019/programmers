package CodingTest.LeetCode.DP.Medium;
/*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

 

Example 1:

Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum underlined below:
[[2,1,3],      [[2,1,3],
 [6,5,4],       [6,5,4],
 [7,8,9]]       [7,8,9]]
Example 2:

Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is underlined below:
[[-19,57],
 [-40,-5]]
Example 3:

Input: matrix = [[-48]]
Output: -48
 

Constraints:

n == matrix.length
n == matrix[i].length
1 <= n <= 100
-100 <= matrix[i][j] <= 100
*/
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=1; i<n; i++){
            matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
            matrix[i][n-1] += Math.min(matrix[i-1][n-1], matrix[i-1][n-2]);
            
            for(int j=1; j<n-1; j++){
                matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
            }
        }
        
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            answer = Math.min(answer, matrix[n-1][i]);
        }
        
        return answer;
    }
    /*
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        
        for(int i=1; i<m; i++){
            matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
            matrix[i][n-1] += Math.min(matrix[i-1][m-1],matrix[i-1][m-2]);
            
            for(int j=1; j<n-1; j++) matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
        }
        
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) answer = Math.min(answer, matrix[m-1][i]);
        
        return answer;
    }
     */
}
