package CodingTest.LeetCode.Array.Easy;

public class FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        String[][] board = new String[3][3];
        int row = board.length, col = board[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                board[i][j] = "E";
            }
        }
        
        for(int i=0; i<moves.length; i++){
            if(i%2==0) board[moves[i][0]][moves[i][1]] = "X";
            else board[moves[i][0]][moves[i][1]] = "O";
        }
        
        //row check
        for(int i=0; i<row; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == "X") return "A";
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == "O") return "B";
        }
        
        //col check
        for(int j=0; j<col; j++){
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == "X") return "A";
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == "O") return "B";
        }
        
        //dialog left check
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == "X") return "A";
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == "O") return "B";

        //dialog right check
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == "X") return "A";
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == "O") return "B";

        if(moves.length == 9) return "Draw";
    
        return "Pending";
    }
}
