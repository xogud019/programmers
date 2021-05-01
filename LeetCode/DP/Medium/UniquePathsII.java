package LeetCode.DP.Medium;
/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and space is marked as 1 and 0 respectively in the grid.

 

Example 1:


Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right
Example 2:


Input: obstacleGrid = [[0,1],[0,0]]
Output: 1
 

Constraints:

m == obstacleGrid.length
n == obstacleGrid[i].length
1 <= m, n <= 100
obstacleGrid[i][j] is 0 or 1.
*/
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] board = new int[m][n];
        
        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1) return 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j] == 1) board[i][j] = -1;
            }
        }
        
        board[0][0] = 1;
        
        for(int i=1; i<m; i++){
            if(board[i][0] != -1) board[i][0] = board[i-1][0];
        }
        
        for(int j=1; j<n; j++){
            if(board[0][j] != -1) board[0][j] = board[0][j-1];
        }
        
        for(int[]i:board){
            for(int j:i) System.out.print(j+" ");
            System.out.println();
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(board[i][j] == -1) continue;
                
                int up = board[i-1][j] == -1? 0: board[i-1][j];
                int left = board[i][j-1] == -1? 0: board[i][j-1];
                
                board[i][j] = up+left;
            }
        }
        /*
        for(int[]i:board){
            for(int j:i) System.out.print(j+" ");
            System.out.println();
        }
        */
        return board[m-1][n-1];
    }
}