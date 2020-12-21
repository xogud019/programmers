package LeetCode.Geometry.Easy;

import java.util.*;
/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
Check if these points make a straight line in the XY plane.

Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example 2:

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 
Constraints:

1.2 <= coordinates.length <= 1000
2.coordinates[i].length == 2
3.-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
4.coordinates contains no duplicate point.
*/
public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
        
        Arrays.sort(coordinates, new Comparator<int[]>(){
           @Override
            public int compare(int[] arr1, int[] arr2){
                if(arr1[0]==arr2[0]) return arr1[1]-arr2[1];
                else return arr1[0]-arr2[0];
            }
        });
        
        double baseX = coordinates[1][0]-coordinates[0][0];
        double baseY = coordinates[1][1]-coordinates[0][1];
        double inc = baseY/baseX;
        
        for(int i=2; i<coordinates.length; i++){
            double x = coordinates[i][0] - coordinates[i-1][0];
            double y = coordinates[i][1] - coordinates[i-1][1];
            double newInc = y/x;
            
            if(inc != newInc) return false;
        }
        
        return true;
    }
}
