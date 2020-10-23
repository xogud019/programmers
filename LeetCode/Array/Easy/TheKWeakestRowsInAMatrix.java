package LeetCode.Array.Easy;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
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
}
