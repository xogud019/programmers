package LeetCode.DFS.Easy;

public class IslandPerimeter {
    static int[] X = {1, 0, -1, 0};
    static int[] Y = {0, 1, 0, -1};
    static int answer = 0;
    
    public int islandPerimeter(int[][] grid) {
        answer = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    dfs(grid,i,j);
                    break;
                }
            }
            
        }
        
        return answer;
    }
    
    public void dfs(int[][] grid, int x, int y){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==0){
            answer++;
            return;
        }
        
        if(grid[x][y] == 2) return;
        grid[x][y] = 2;
        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
    }
}
