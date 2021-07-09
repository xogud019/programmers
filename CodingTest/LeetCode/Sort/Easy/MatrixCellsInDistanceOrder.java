package CodingTest.LeetCode.Sort.Easy;

import java.util.*;

public class MatrixCellsInDistanceOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] answer = new int[R*C][2];   
        int idx = 0;
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                answer[idx][0] = i;
                answer[idx++][1] = j;
            }
        }
        
        Arrays.sort(answer, new Comparator<int[]>(){
           @Override
            public int compare(int[] a1, int[] a2){
                return (Math.abs(a1[0]-r0)+Math.abs(a1[1]-c0))-(Math.abs(a2[0]-r0)+Math.abs(a2[1]-c0));
            }
        });
        
        return answer;
    }
}
