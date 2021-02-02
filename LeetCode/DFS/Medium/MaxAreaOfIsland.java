package LeetCode.DFS.Medium;
/*
Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

Example 2:

[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.
*/
public class MaxAreaOfIsland {
    static int[] X = {0, 1, 0, -1};
    static int[] Y = {1, 0, -1, 0};
    boolean[][] visited;
    int count;
    
    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int answer = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    count = 0;
                    dfs(grid, i, j);
                    answer = Math.max(count, answer);
                }   
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] grid, int x, int y){
        count++;
        visited[x][y] = true;
        
        for(int i=0; i<4; i++){
            int newX = x+X[i];
            int newY = y+Y[i];
            
            if(newX >=0 && newY >= 0 && newX <grid.length && newY < grid[0].length && !visited[newX][newY] && grid[newX][newY] == 1){
                dfs(grid, newX, newY);
            }
        }
        
        return;
    }
}
