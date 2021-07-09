package CodingTest.LeetCode.BackTracking.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9
*/
public class NQueens {
    String[][] board;
    List<List<String>> answer;
    
    public List<List<String>> solveNQueens(int n) {
        board = new String[n][n];
        answer = new ArrayList<>();
        
        for(int i=0; i<n; i++) Arrays.fill(board[i],".");
        
        for(int i=0; i<n; i++){
            board[0][i] = "Q";
            backtracking(1, 0, n);
            board[0][i] = ".";
        }
                
        return answer;
    }
    
    public void backtracking(int x, int y, int n){
        if(x == n || y == n){
            List<String> list = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                StringBuilder sb = new StringBuilder();
                
                for(int j=0; j<n; j++) sb.append(board[i][j]);    
                
                list.add(sb.toString());
            }
            
            answer.add(new ArrayList<String>(list));
            return;
        }
        
        for(int i=0; i<n; i++){
            //if(i == y) continue;
            if(promising(x, i,n)){
                board[x][i] = "Q";
                backtracking(x+1, 0, n);
                board[x][i] = ".";
            }
        }
    }
    
    public boolean promising(int x, int y, int n){
        //check row
        for(int i=0; i<y; i++){
            if(board[x][i].equals("Q")) return false;
        }
        //check col
        for(int i=0; i<x; i++){
            if(board[i][y].equals("Q")) return false;
        }
        //check dia
        for(int i=x-1, j = y-1; i>=0&& j>=0; i--,j--){
            //System.out.println(i+","+j);
            if(board[i][j].equals("Q")) return false;
        }
        
        //check rev dia
        for(int i=x-1, j = y+1; i>=0&&j<n; i--, j++){
            //System.out.println(i+","+j);
            if(board[i][j].equals("Q")) return false;
        }
        return true;
    }
    
    public void print(String[][] board){
        for(String[] str : board){
            for(String s : str) System.out.print(s);
            System.out.println();
        }
    }
}
