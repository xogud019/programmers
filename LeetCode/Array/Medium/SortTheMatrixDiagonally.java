package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

 

Example 1:


Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
Example 2:

Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
1 <= mat[i][j] <= 100
*/
public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int diff = i-j;
                
                List<Integer> list = map.getOrDefault(diff, new ArrayList<>());
                list.add(mat[i][j]);
                
                map.put(diff,list);
            }
        }
        
        for(int i:map.keySet()) Collections.sort(map.get(i));
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int diff = i-j;
                
                mat[i][j] = map.get(diff).remove(0);
            }
            //System.out.println();
        }
        
        return mat;
    }
    /*
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] arr = new int[m][n];
        int k = 0;
        for(int d=0; d<m+n-1; d++){
            for(int i=0; i<m; i++){
                int j = d-i;
                System.out.print(i+","+j+" ");
                if(j>=0 && j<n){
                    //System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
        
        return arr;
    }
    */
}
