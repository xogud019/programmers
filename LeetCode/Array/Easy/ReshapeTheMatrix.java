package LeetCode.Array.Easy;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        int count = 0;
        
        if(row*col != r*c) return nums;
        
        int[][] answer = new int[r][c];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[count/c][count%c] = nums[i][j];
                count++;
            }
        }
        
        return answer;
    }
}
