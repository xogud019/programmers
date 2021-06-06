package LeetCode.Array.Easy;
/*
Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.

*/
public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int cnt = 0;
        
        while(cnt < 4){
            boolean same = false;
            
            rotate(mat);
            A:
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    if(mat[i][j] == target[i][j]) same = true;
                    else{
                        same = false;
                        break A;
                    }
                }
            }
            
            if(same) return true;
            
            cnt++;
        }
        
        return false;
    }
    
    public void rotate(int[][] arr){
        int n = arr.length, m = arr[0].length;
        
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[n-i-1][j];
                arr[n-i-1][j] = temp;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
