package LeetCode.BFS.Medium;
/*
In an N by N square grid, each cell is either empty (0) or blocked (1).

A clear path from top-left to bottom-right has length k if and only if it is composed of cells C_1, C_2, ..., C_k such that:

Adjacent cells C_i and C_{i+1} are connected 8-directionally (ie., they are different and share an edge or corner)
C_1 is at location (0, 0) (ie. has value grid[0][0])
C_k is at location (N-1, N-1) (ie. has value grid[N-1][N-1])
If C_i is located at (r, c), then grid[r][c] is empty (ie. grid[r][c] == 0).
Return the length of the shortest such clear path from top-left to bottom-right.  If such a path does not exist, return -1.

Example 1:

Input: [[0,1],[1,0]]
Output: 2

Example 2:

Input: [[0,0,0],[1,1,0],[1,1,0]]
Output: 4

Note:
1 <= grid.length == grid[0].length <= 100
grid[r][c] is 0 or 1
*/

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    /*time out
    static int[] X = {1, 1, 0, -1, -1, 1, 0, -1};
    static int[] Y = {0, 1, 1, -1, 0, -1, -1, 1};
    //bfs
    **
    class Node{
        int x = 0;
        int y = 0;
        int dis = 0;
        
        Node(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    **
    class Node{
        int x = 0;
        int y = 0;
        
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Node> q = new LinkedList<>();
        int row = grid.length, col = grid[0].length;
        
        if(grid[0][0] == 1 || grid[row-1][col-1] == 1) return -1;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1) grid[i][j] = -1;
            }
        }
        
        q.add(new Node(0,0));
        grid[0][0] = 1;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            
            int x = node.x;
            int y = node.y;
            
            if(x == row-1 && y == col-1) break;
            
            for(int i=0; i<8; i++){
                int newX = x+X[i];
                int newY = y+Y[i];
                
                //this part is Cause of timeout
                if(newX >=0 && newY >=0 && newX < row && newY < col && grid[newX][newY] != -1){
                    if(grid[newX][newY] == 0) grid[newX][newY] = grid[x][y]+1;
                    else grid[newX][newY] = Math.min(grid[newX][newY],grid[x][y]+1);
                    
                    q.add(new Node(newX,newY));
                }
            }
        }
        
        return grid[row-1][col-1];
    }
    */
    
    static int[] X = {1, 1, 0, -1, -1, 1, 0, -1};
    static int[] Y = {0, 1, 1, -1, 0, -1, -1, 1};
  
    class Node{
        int x = 0;
        int y = 0;
        
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Node> q = new LinkedList<>();
        int row = grid.length, col = grid[0].length;
        int answer = Integer.MAX_VALUE;
        
        if(grid[0][0] == 1 || grid[row-1][col-1] == 1) return -1;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1) grid[i][j] = -1;
            }
        }
        
        q.add(new Node(0,0));
        grid[0][0] = 1;
        
        while(!q.isEmpty()){
            Node node = q.poll();
                        
            if(node.x == row-1 && node.y == col-1){
                answer = Math.min(answer, grid[node.x][node.y]);
                break;
            }
            
            for(int i=0; i<8; i++){
                int newX = node.x+X[i];
                int newY = node.y+Y[i];
                
                if(newX >=0 && newY >=0 && newX < row && newY < col && grid[newX][newY] != -1){
                    if(grid[newX][newY] == 0){ 
                        grid[newX][newY] = grid[node.x][node.y]+1;
                        q.add(new Node(newX, newY));
                    }
                    else if(grid[newX][newY] > grid[node.x][node.y]+1){
                        grid[newX][newY] = grid[node.x][node.y]+1;
                        q.add(new Node(newX, newY));   
                    }
                }
            }
            
        }

        return answer == 0 || answer == Integer.MAX_VALUE ? -1 : answer;
    }
    
    public void print(int[][] arr){
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
