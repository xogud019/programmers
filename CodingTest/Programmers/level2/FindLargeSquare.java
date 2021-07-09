package CodingTest.Programmers.level2;


public class FindLargeSquare {
    public static void main(String[] args){
        //int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        int[][] board = {{0,0,1,1},{1,1,1,1}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board){
        int max = 0;

        if(board.length==1){
            return 1;
        }
        
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[i].length; j++){
                if(board[i][j]==1){
                    board[i][j]=Math.min(board[i-1][j-1],Math.min(board[i-1][j], board[i][j-1]))+1;
                    if(board[i][j]>max){
                        max= board[i][j];
                    }
                }
            }
        }
        
        return max*max;
    }
}