package LeetCode.DP.Medium;
/*
Given a m * n matrix mat and an integer K, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for i - K <= r <= i + K, j - K <= c <= j + K, and (r, c) is a valid position in the matrix.
 

Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]

Example 2:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]
 

Constraints:
1.m == mat.length
2.n == mat[i].length
3.1 <= m, n, K <= 100
4.1 <= mat[i][j] <= 100
*/
public class MatrixBlockSum {
    /*using dp
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length, n = mat[0].length;
        int[][] answer = new int[m][n], dp = new int[m+1][n+1];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) dp[i+1][j+1] = dp[i+1][j] + dp[i][j+1] + mat[i][j] - dp[i][j];
        }
        
        for(int[] i:dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int r1 = Math.max(0,i-K);
                int c1 = Math.max(0,j-K);
                int r2 = Math.min(m, i+K+1);
                int c2 = Math.min(n, j+K+1);
                
                answer[i][j] = dp[r2][c2]-dp[r1][c2]-dp[r2][c1]+dp[r1][c1];
            }
        }
        
        return answer;
    }
    */
    /*
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] answer = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int sum = 0;
                
                for(int r=Math.max(0,i-K); r<=i+K && r<row; r++){
                    for(int c=Math.max(0,j-K); c<=j+K && c<col; c++){
                        sum += mat[r][c];
                    }
                }
                
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
    */
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length, n = mat[0].length;
        int[][] answer = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int val = 0;
                
                for(int r = i-K; r<=i+K; r++){
                    if(r<0 || r>=m) continue;
                    
                    for(int c = j-K; c<=j+K; c++){
                        if(c<0 || c>=n) continue;
                        
                        val += mat[r][c];
                    }
                }
                
                answer[i][j] = val;
            }
        }
        
        return answer;
    }
}
