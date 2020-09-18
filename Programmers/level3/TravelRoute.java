package Programmers.level3;

import java.util.*;
//not
public class TravelRoute {
    static ArrayList<String>list = new ArrayList<>();
    static String route = "";
    static boolean[] visited;
    public static void main(String[] args){
        //String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        //String[][] tickets = {{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}, {"BOO", "DOO"}};
        String[] result = solution(tickets);
        
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
   
    public static String[] solution(String[][] tickets) {
        String start = "ICN";
        visited = new boolean[tickets.length];

        for(int i=0; i<tickets.length; i++){
            if(tickets[i][0].equals(start)){
                visited[i] = !visited[i];
                route =start+",";
                dfs(tickets, tickets[i][1], 1);
                visited[i] = !visited[i];
            }
        }
        
        Collections.sort(list);
        String[] answer = list.get(0).split(",");
        return answer;
    }

    public static void dfs(String[][] tickets, String end, int depth){
        route+=end+",";

        if(depth==tickets.length){
            System.out.println(route);
            list.add(route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            if(end.equals(tickets[i][0])&&!visited[i]){
                visited[i] = !visited[i];
                dfs(tickets, tickets[i][1], depth+1);
                visited[i] = !visited[i];
                route = route.substring(0,route.length()-4);
            }
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

