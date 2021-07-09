package CodingTest.LeetCode.Math.Easy;
/*
You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

col = a~h
row = 1~8
wbwb....
....bwbw

Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

 

Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
Example 3:

Input: coordinates = "c7"
Output: false
 

Constraints:

coordinates.length == 2
'a' <= coordinates[0] <= 'h'
'1' <= coordinates[1] <= '8'
*/
public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        int row = coordinates.charAt(1)-'0';
        
        if(row%2 == 0 && (col == 'a' || col == 'c' || col == 'e'|| col == 'g')) return true;
        else if(row%2==1 && (col == 'b' || col == 'd' || col == 'f'|| col == 'h')) return true;
        
        return false;
    }
}
