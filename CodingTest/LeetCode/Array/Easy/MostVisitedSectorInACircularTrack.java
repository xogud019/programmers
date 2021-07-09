package CodingTest.LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> answer = new ArrayList<>();
        int start = rounds[0], end = rounds[rounds.length-1];
        
        if(end >= start){
            for(int i=start; i<=end; i++) answer.add(i);
            
        }
        else{
            for(int i=1; i<=n; i++){
                if(i >= start || i <= end) answer.add(i);
            }
        }
        
        return answer;
    }
}
