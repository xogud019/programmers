package LeetCode.Medium;
/*
You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:

A stone '#'
A stationary obstacle '*'
Empty '.'
The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.

Return an n x m matrix representing the box after the rotation described above.

 

Example 1:



Input: box = [["#",".","#"]]
Output: [["."],
         ["#"],
         ["#"]]
Example 2:



Input: box = [["#",".","*","."],
              ["#","#","*","."]]
Output: [["#","."],
         ["#","#"],
         ["*","*"],
         [".","."]]
Example 3:



Input: box = [["#","#","*",".","*","."],
              ["#","#","#","*",".","."],
              ["#","#","#",".","#","."]]
Output: [[".","#","#"],
         [".","#","#"],
         ["#","#","*"],
         ["#","*","."],
         ["#",".","*"],
         ["#",".","."]]
 

Constraints:

m == box.length
n == box[i].length
1 <= m, n <= 500
box[i][j] is either '#', '*', or '.'.
*/
public class RotatingTheBox {
    /*wrong answer
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length, col = box[0].length;
        
        char[][] rBox = new char[col][row];
        
        //rotate
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                rBox[j][row-1-i] = box[i][j];
            }
        }
        
        for(int j=0; j < row; j++){
            for(int k=col-1; k > 0; k--){
                if(rBox[k][j] == '*') continue;
                
                for(int i=k; i > 0; i--){
                    if(rBox[i][j] == '.' && rBox[i-1][j] == '#'){
                        rBox[i][j] = '#';
                        rBox[i-1][j] = '.';
                    }
                }
            }
            
        }
        return rBox;
    }
    */
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length, col = box[0].length;
        
        char[][] rBox = new char[col][row];
        
        //rotate
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                rBox[j][row-1-i] = box[i][j];
            }
        }
        
        for(int j=0; j < row; j++){
            for(int k=col-1; k > 0; k--){
                if(rBox[k][j] == '*') continue;
                
                for(int i=col-1; i > 0; i--){
                    if(rBox[i][j] == '.' && rBox[i-1][j] == '#'){
                        rBox[i][j] = '#';
                        rBox[i-1][j] = '.';
                    }
                }
            }
            
        }
        return rBox;
    }
}
