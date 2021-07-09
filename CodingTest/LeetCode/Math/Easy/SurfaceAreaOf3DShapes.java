package CodingTest.LeetCode.Math.Easy;

public class SurfaceAreaOf3DShapes {
    static int[] X = {-1, 0, 1, 0};
    static int[] Y = {0, 1, 0, -1};
    
    public int surfaceArea(int[][] grid) {
        int answer = 0;
        int len = grid.length;
        
        for(int x=0; x<len; x++){
            for(int y=0; y<len; y++){
                if(grid[x][y] > 0) answer +=2;
                
                for(int k=0; k<4; k++){
                    int newX = x + X[k];
                    int newY = y + Y[k];
                    int val = 0;
                    
                    if(newX >=0 && newX < len && newY >= 0 && newY < len) val = grid[newX][newY];
                    
                    answer += Math.max(grid[x][y] - val, 0);
                }
            }
        }
        
        return answer;
    }
    /*failed case
    public int surfaceArea(int[][] grid) {
        int top = 0 ,bot = 0 , fro =0, back = 0, left = 0, right = 0, depth = 0;
        int zero = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int[] i : grid){
            for(int j : i){
                if(j==0) zero++;
            }
        }
        
        top = row * col - zero;
        bot = row * col - zero;
        
        for(int i=0; i<col; i++){
            fro += grid[0][i];
            back += grid[row-1][i];
        }
        
        for(int i=0; i<row; i++){
            left += grid[i][0];
            right += grid[i][col-1];
        }
        
        return top+bot+fro+back+left+right+depth;
    }
    */
}
