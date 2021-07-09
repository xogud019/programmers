package CodingTest.LeetCode.Sort.Easy;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        int[][] arrs = new int[arr.length][2];
        int len = arr.length;
        
        for(int i=0; i<len; i++) arrs[i][0] = arr[i];
        
        
        for(int i=0; i<len; i++){
            String s = Integer.toBinaryString(arr[i]);
            int count = 0;
            
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='1') count++;    
            }
            
            arrs[i][1] = count;
        }
        
        Arrays.sort(arrs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                if(a1[1]==a2[1]){
                    return a1[0]-a2[0];
                }
                else return a1[1]-a2[1];
            }
        });
        
        for(int i=0; i<len; i++){
            arr[i] = arrs[i][0];
        }
        
        return arr;
    }
}
