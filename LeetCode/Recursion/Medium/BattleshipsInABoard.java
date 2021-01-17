package LeetCode.Recursion.Medium;
/*
Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
You receive a valid board, made of only battleships or empty slots.
Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
Example:
X..X
...X
...X
In the above board there are 2 battleships.
Invalid Example:
...X
XXXX
...X
This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
Follow up:
Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?
*/
public class BattleshipsInABoard {
    static int[] X = {1,0,-1,0};
    static int[] Y = {0,1,0,-1};
    boolean[][] visited;
    
    public int countBattleships(char[][] board) {
        int answer = 0;
        int r = board.length, c = board[0].length;
        visited = new boolean[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(board[i][j] == '.') continue;
                if(!visited[i][j]){
                    countShip(board,i,j);
                    answer++;   
                }
            }
        }
        
        return answer;
    }
    
    public void countShip(char[][] board, int x, int y){
        if(!visited[x][y]) visited[x][y] = true;
        if(board[x][y] =='.') return;
        
        for(int i=0; i<4; i++){
            int newX = x+X[i];
            int newY = y+Y[i];
            
            if(newX>=0 && newY>=0 && newX<board.length && newY<board[0].length && board[newX][newY] =='X' && !visited[newX][newY]) countShip(board, newX, newY);
        }
    }
}
