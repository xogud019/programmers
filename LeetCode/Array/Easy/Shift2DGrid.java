package LeetCode.Array.Easy;

import java.util.*;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        
        for(; k>0; k--){
            int[][] arr = new int[row][col];
            
            for(int i=0; i<row; i++){
                for(int j=0; j<col-1; j++){
                    arr[i][j+1] = grid[i][j];
                }
            }
            
            for(int i=0; i<row-1; i++){
                arr[i+1][0] = grid[i][col-1];
            }
            
            arr[0][0] = grid[row-1][col-1];
            //print(arr);
            
            grid = arr;
        }
        
        for(int[] i:grid){
            List<Integer> list = new ArrayList<>();
            answer.add(list);
            for(int j:i){
                list.add(j);
            }
        }
        
        return answer;
    }
    /* failed case
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list;
        int[] arr = new int[row*col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
      	        arr[( i * row ) + j ] = grid[i][j];
            }
        }
        
        for(int j=0; j<k; j++){
            int temp = arr[arr.length-1];
            
            for(int i=arr.length-1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            
            arr[0] = temp;
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                grid[i][j] = arr[i*row+j];
            }
        }
        
        for(int i=0; i<row; i++){
            list = new ArrayList<>();
            
            for(int j=0; j<col; j++){
                list.add(grid[i][j]);
            }
            
            answer.add(list);
        }
        
        return answer;
    }
    */
}
