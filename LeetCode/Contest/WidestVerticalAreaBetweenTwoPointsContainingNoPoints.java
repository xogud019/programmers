package LeetCode.Contest;

import java.util.*;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int answer = 0;
        
        Arrays.sort(points, new Comparator<int[]>(){
           @Override
            public int compare(int[] a1 , int[] a2){
                return a1[0]-a2[0];
            }
        });
        
        for(int i=1; i<points.length; i++){
            answer = Math.max(answer , points[i][0]-points[i-1][0]);
        }
        
        return answer;
    }
}
