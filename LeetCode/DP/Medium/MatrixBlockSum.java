package LeetCode.DP.Medium;

public class MatrixBlockSum {
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
}
