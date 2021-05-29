package LeetCode.BackTracking.Hard;
/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
*/
public class NQueensII {
    int[] board;
    int answer;
    
    public int totalNQueens(int n) {
        board = new int[n];    
        answer = 0;
        
        for(int i=0; i<n; i++){
            board[0] = i;
            
            backtracking(1, n);
        }
        
        return answer;
    }
    
    public void backtracking(int depth, int n){
        if(depth == n){
            answer++;
            return;
        }
        
        for(int i=0; i<n; i++){
            if(promising(i, depth, n)){
                board[depth] = i;
                backtracking(depth+1, n);
            }
        }
    }
    
    public boolean promising(int idx, int depth, int n){
        //col
        for(int i= depth-1; i>=0; i--){
            if(board[i] == idx) return false;
        }
        
        //dia
        int j = 1;
        for(int i= depth-1; i>=0; i--){
            if(board[i] - j == idx || board[i] + j == idx) return false;
            j++;
        }
        
        return true;
    }
}
