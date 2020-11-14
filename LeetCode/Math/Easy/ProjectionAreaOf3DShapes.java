package LeetCode.Math.Easy;

public class ProjectionAreaOf3DShapes {
    /*
    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0;  // largest of grid[i][j]
            int bestCol = 0;  // largest of grid[j][i]
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) ans++;  // top shadow
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }
    */
    public int projectionArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fro = 0;
        int sid = 0;
        int zero = 0;
        int[] front = new int[row];
        int[] side = new int[col];
        int idx = 0;
        
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                front[idx] = Math.max(front[idx],grid[j][i]);        
            }
            idx++;
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                side[i] = Math.max(side[i],grid[i][j]);
            }
        }
        
        for(int[] i:grid){
            for(int j:i){
                if(j==0) zero++;
            }
        }
        
        for(int i:front) fro += i;
        
        for(int i:side) sid += i;
        
        return row*col+fro+sid-zero;
    }
}
