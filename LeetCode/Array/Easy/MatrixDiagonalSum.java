package LeetCode.Array.Easy;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int answer = 0;
        
        for(int i=0; i<len; i++){
            answer += mat[i][i];    
        }
        
        int j = 0;
        
        for(int i=len-1; i>=0; i--){
            answer += mat[i][j++];
        }
        
        if(len%2==1){
            answer -= mat[len/2][len/2];
        }
        
        return answer;
    }
}
