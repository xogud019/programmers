package CodingTest.LeetCode.Sort.Easy;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
    //time 2 ms	 memory 40.4 MB
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr = new int[mat.length][2];
        int[] answer = new int[k];
        
        for(int i=0; i<mat.length; i++){
            int count = 0;
            
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1) count++;   
            }
            
            arr[i][0] = i;
            arr[i][1] = count;
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
           @Override
            public int compare(int[] v1, int[] v2){
                if(v1[1]==v2[1]) return v1[0]-v2[0];
                else return v1[1]-v2[1];
            }
        });
        
        for(int i=0; i<k; i++) answer[i] = arr[i][0];
        
        return answer;
    }
    /*time 1 ms	 memory 39.9 MB
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length, c = mat[0].length;
        int[] answer = new int[k];
        int[][] arr = new int[r][2];
        
        for(int i=0; i<r; i++) arr[i][0] = i;
        
        for(int i=0; i<r; i++) arr[i][1] = count(mat[i]);
   
        Arrays.sort(arr, new Comparator<int[]>() {
           @Override
            public int compare(int[] a, int[] b){
                if(a[1] == b[1]) return a[0]-b[0];
                else return a[1]-b[1];
            }
        });
        
        for(int i=0; i<k; i++) answer[i] = arr[i][0];
        
        return answer;
    }
    
    public int count(int[] arr){
        int cnt = 0;
        
        for(int i:arr){
            if(i==1) cnt++;
        }
        
        return cnt;
    }
    */
}
