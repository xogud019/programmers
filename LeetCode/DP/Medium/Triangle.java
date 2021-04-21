package LeetCode.DP.Medium;

import java.util.List;

/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

 

Example 1:

Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10
 

Constraints:

1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
 
*/
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) return triangle.get(0).get(0);
        
        int row = triangle.size();
        int[][] arr = new int[row][];
        
        for(int i=0; i<row; i++){
            int col = triangle.get(i).size();
            arr[i] = new int[col];
            
            for(int j=0; j<col; j++){
                arr[i][j] = triangle.get(i).get(j);
            }
        }
        
        for(int i=1; i<row; i++){
            int col = arr[i].length;
            arr[i][0] += arr[i-1][0];
            arr[i][col-1] += arr[i-1][col-2];
            
            for(int j=1; j<col-1; j++){
                arr[i][j] += Math.min(arr[i-1][j-1], arr[i-1][j]);    
            }
        }
        
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<arr[row-1].length; i++){
            answer = Math.min(answer, arr[row-1][i]);
        }
        
        return answer;
    }
}
