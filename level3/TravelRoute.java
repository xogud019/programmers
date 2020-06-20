package level3;
import java.util.*;
//not
public class TravelRoute {
    public static void main(String[] args){
        //String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] result = solution(tickets);
    
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        Arrays.sort(tickets);
        print(tickets);
        return answer;
    }

    public static void dfs(int depth, int max){
        if(depth==max){
            return;
        }
    }

    public static void print(String[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

