package LeetCode.BFS.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.

Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

Note:

The order of returned grid coordinates does not matter.
Both m and n are less than 150.
 

Example:

Given the following 5x5 matrix:

  Pacific ~   ~   ~   ~   ~ 
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic

Return:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
*/
public class PacificAtlanticWaterFlow {
    //bfs
    static int[] X = {0, 1, 0, -1};
    static int[] Y = {1, 0, -1, 0};
    class Cell{
        int x = 0;
        int y = 0;
        int val = 0;
        
        public Cell(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
                
        boolean[][] pacific = new boolean[row][col], atlantic = new boolean[row][col];
        Queue<Cell> pQ = new LinkedList<>();
        Queue<Cell> aQ = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        //top to bottom
        for(int i=0; i<row; i++){
            pQ.add(new Cell(i, 0, matrix[i][0]));
            pacific[i][0] = true;
            
            aQ.add(new Cell(i, col-1, matrix[i][col-1]));
            atlantic[i][col-1] = true;
            //System.out.println(matrix[i][0]+" "+matrix[i][col-1]);
        }
        //left to right
        for(int i=0; i<col; i++){
            pQ.add(new Cell(0, i, matrix[0][i]));
            pacific[0][i] = true;
            
            aQ.add(new Cell(row-1, i, matrix[row-1][i]));
            atlantic[row-1][i] = true;
            //System.out.println(matrix[i][0]+" "+matrix[i][col-1]);
        }
        bfs(pacific, matrix, pQ);
        bfs(atlantic, matrix, aQ);
        /*
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(pacific[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(atlantic[i][j]+" ");
            }
            System.out.println();
        }
        */
        List<Integer> list;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                list = new ArrayList<>();
                
                if(pacific[i][j]&&atlantic[i][j]){
                    list.add(i);
                    list.add(j);
                    answer.add(list);
                }
            }
        }
        
        return answer;
    }
    
    public void bfs(boolean[][] visited, int[][] arr, Queue<Cell> q){
        while(!q.isEmpty()){
            Cell cell = q.poll();
            
            //if(visited[cell.x][cell.y]) continue;
            
            visited[cell.x][cell.y] = true;
            
            for(int i=0; i<4; i++){
                int newX = cell.x + X[i];
                int newY = cell.y + Y[i];
                
                if(newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length || visited[newX][newY]) continue;
                if(cell.val <= arr[newX][newY]) q.add(new Cell(newX, newY, arr[newX][newY]));
            }
        }
    }
    /*dfs
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int numRows;
    private int numCols;
    private int[][] landHeights;
    
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        // Check if input is empty
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        
        // Save initial values to parameters
        numRows = matrix.length;
        numCols = matrix[0].length;
        landHeights = matrix;
        boolean[][] pacificReachable = new boolean[numRows][numCols];
        boolean[][] atlanticReachable = new boolean[numRows][numCols];
        
        // Loop through each cell adjacent to the oceans and start a DFS
        for (int i = 0; i < numRows; i++) {
            dfs(i, 0, pacificReachable);
            dfs(i, numCols - 1, atlanticReachable);
        }
        for (int i = 0; i < numCols; i++) {
            dfs(0, i, pacificReachable);
            dfs(numRows - 1, i, atlanticReachable);
        }
        
        // Find all cells that can reach both oceans
        List<List<Integer>> commonCells = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    commonCells.add(List.of(i, j));
                }
            }
        }
        return commonCells;
    }
    
    private void dfs(int row, int col, boolean[][] reachable) {
        // This cell is reachable, so mark it
        reachable[row][col] = true;
        for (int[] dir : DIRECTIONS) { // Check all 4 directions
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            // Check if new cell is within bounds
            if (newRow < 0 || newRow >= numRows || newCol < 0 || newCol >= numCols) {
                continue;
            }
            // Check that the new cell hasn't already been visited
            if (reachable[newRow][newCol]) {
                continue;
            }
            // Check that the new cell has a higher or equal height,
            // So that water can flow from the new cell to the old cell
            if (landHeights[newRow][newCol] < landHeights[row][col]) {
                continue;
            }
            // If we've gotten this far, that means the new cell is reachable
            dfs(newRow, newCol, reachable);
        }
    }
    */
}
