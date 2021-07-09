package CodingTest.LeetCode.Array.Easy;
/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the row number and column number of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 

Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
*/
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        int count = 0;
        
        if(row*col != r*c) return nums;
        
        int[][] answer = new int[r][c];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[count/c][count%c] = nums[i][j];
                count++;
            }
        }
        
        return answer;
    }
    /*
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        
        if(m*n != r*c) return mat;
        
        List<Integer> list = new ArrayList<>();
        
        for(int[] i:mat)
            for(int j:i) list.add(j);
        
        int[][] answer = new int[r][c];
        
        int idx = 0;
        
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++) answer[i][j] = list.get(idx++);
        
        return answer;
    }
    */

    /*
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int a = nums.length, b = nums[0].length;

        if (r * c != a * b) {
            return nums;
        }

        int[][] res = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = nums[i / b][i % b];
        }

        return res;
    }
    */
}
