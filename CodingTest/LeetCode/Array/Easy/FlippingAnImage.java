package CodingTest.LeetCode.Array.Easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] answer = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = A[i][(col-1)-j];
                if(answer[i][j]==0) answer[i][j] =1;
                else answer[i][j] = 0;
            }
        }
        
        return answer;
    }
}
