package CodingTest.LeetCode.String.Easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for(int i=0; i<moves.length(); i++){
            char temp = moves.charAt(i);
            
            if(temp == 'U') y++;
            else if(temp == 'D') y--;
            else if(temp == 'L') x--;
            else x++;
        }
        
        return x==0&&y==0;
    }
}
