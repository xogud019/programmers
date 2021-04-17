package LeetCode.Prefix.Hard;

import java.util.HashMap;
/*
Given a matrix and a target, return the number of non-empty submatrices that sum to target.

A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.

Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.

 

Example 1:


Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
Output: 4
Explanation: The four 1x1 submatrices that only contain 0.
Example 2:

Input: matrix = [[1,-1],[-1,1]], target = 0
Output: 5
Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
Example 3:

Input: matrix = [[904]], target = 0
Output: 0
 

Constraints:

1 <= matrix.length <= 100
1 <= matrix[0].length <= 100
-1000 <= matrix[i] <= 1000
-10^8 <= target <= 10^8
*/
public class NumberOfSubmatricesThatSumToTarget {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int[][] pre = new int[row+1][col+1];
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                pre[i][j] = matrix[i-1][j-1] + pre[i][j-1];        
            }
        }
        
        HashMap<Integer, Integer> map;
        int answer = 0;
        
        for(int startCol = 0; startCol < col; startCol++){
            for(int endCol = startCol+1; endCol < col+1; endCol++){
                map = new HashMap<>();
                map.put(0,1);
                int sum = 0;
                
                for(int j=1; j<=row; j++){
                    sum += pre[j][endCol] - pre[j][startCol];
                
                    answer += map.getOrDefault(sum-target, 0);
                    
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        /*
        for(int startRow = 0; startRow < row; startRow++){
            for(int endRow = startRow+1; endRow < row+1; endRow++){
                map = new HashMap<>();
                map.put(0,1);
                
                int sum = 0;
                for(int j=1; j<=col; j++){
                    sum += pre[endRow][j] - pre[startRow][j];
                    
                    answer += map.getOrDefault(sum-target, 0);
                    
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        */
        return answer;
    }
}
