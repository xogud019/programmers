package LeetCode.DFS.Medium;
/*
Let's play the minesweeper game (Wikipedia, online game)!

You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.

Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'), return the board after revealing this position according to the following rules:

If a mine ('M') is revealed, then the game is over - change it to 'X'.
If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
Return the board when no more squares will be revealed.
 

Example 1:

Input: 

[['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'M', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

Click : [3,0]

Output: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:

Example 2:

Input: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Click : [1,2]

Output: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'X', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:

Note:
1.The range of the input matrix's height and width is [1,50].
2.The click position will only be an unrevealed square ('M' or 'E'), which also means the input board contains at least one clickable square.
3.The input board won't be a stage when game is over (some mines have been revealed).
4.For simplicity, not mentioned rules should be ignored in this problem. For example, you don't need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.
*/
public class Minesweeper {
    static int[] X = {1, 1, 0, -1, -1, 1, 0, -1};
    static int[] Y = {0, 1, 1, -1, 0, -1, -1, 1};
    
    public char[][] updateBoard(char[][] board, int[] click) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        dfs(board, visited, click[0],click[1]);
        return board;
    }
    
    public void dfs(char[][] board, boolean[][] visited, int x, int y){
        if(x < 0 || y < 0 || x>=board.length || y>= board[0].length || visited[x][y]) return;
        
        visited[x][y] = true;
        
        if(board[x][y] == 'M'){
            board[x][y] = 'X';
            return;
        }
        
        int num = check(board, x, y);
        
        if(num != 0){
            board[x][y] = (char)(num+'0');
            return;
        }
        
        board[x][y] = 'B';
        
        for(int i=0; i<8; i++){
            int newX = x+X[i];
            int newY = y+Y[i];
            
            dfs(board, visited, newX , newY);
        }
    }
    
    public int check(char[][] board, int x, int y){
        int count = 0;
        
        for(int i=0; i<8; i++){
            int newX = x+X[i];
            int newY = y+Y[i];
            if(newX < 0 || newY < 0 || newX>=board.length || newY>= board[0].length) continue;
            
            if(board[newX][newY] == 'M') count++;
        }
        return count;
    }
}
