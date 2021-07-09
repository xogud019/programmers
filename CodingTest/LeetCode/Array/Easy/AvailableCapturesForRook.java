package CodingTest.LeetCode.Array.Easy;

public class AvailableCapturesForRook {
    static int[] X = {-1, 0, 1, 0};
    static int[] Y = {0, 1, 0, -1};
    
    public int numRookCaptures(char[][] board) {
        int answer = 0, x = 0, y = 0;
        
        for(int i=0; i<8; i++){
            boolean isT = false;
            for(int j=0; j<8; j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                    isT = true;
                    break;
                }        
            }
            
            if(isT) break;
        }
        
        for(int i=0; i<4; i++){
            int newX = x;
            int newY = y;
            
            while(true){
                newX += X[i];
                newY += Y[i];
                
                if(newX < 0 || newX >= 8 || newY < 0 || newY >= 8) break;
                if(board[newX][newY] == 'B') break;
                if(board[newX][newY] == 'p'){
                    answer++;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}
