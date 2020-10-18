package LeetCode.Array.Easy;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int len = points.length;
        int answer = 0;
        
        for(int i=len-1; i>=1; i--){
            answer += Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        
        return answer;
        /*
        int answer = 0;
        int xStart = points[0][0];
        int yStart = points[0][1];
        
        for(int i=1; i<points.length; i++){
            int xEnd = points[i][0];
            int yEnd = points[i][1];
            
            while(xStart != xEnd || yStart != yEnd){
                if(xStart<xEnd) xStart++;
                if(xStart>xEnd) xStart--;
                if(yStart<yEnd) yStart++;
                if(yStart>yEnd) yStart--;
                
                answer++;
            }
        }
        
        return answer;
        */
    }
}
