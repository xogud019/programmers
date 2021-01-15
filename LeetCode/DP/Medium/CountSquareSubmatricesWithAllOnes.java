package LeetCode.DP.Medium;
/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.

Example 2:

Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.
 

Constraints:
1.1 <= arr.length <= 300
2.1 <= arr[0].length <= 300
3.0 <= arr[i][j] <= 1
*/
public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int answer = 0;
        int r = matrix.length, c = matrix[0].length;
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == 0) continue;
                
                if(i>0 && j>0){
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i][j-1]));
                }
                
                answer += matrix[i][j];
            }
            
        }
        
        return answer;
    }
}
