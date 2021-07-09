package CodingTest.BJ.Graph;

import java.util.*;

public class ShortPass {
    final static int INF = 10000000;

    public static void main(String[] args){
        int vartax = 5;
        int edge = 6;
        int start = 1;
        int[][] dp = new int[vartax][vartax];
        int[][] graph = {{5,1,1},{1,2,2},{1,3,3},{2,3,4},{2,4,5},{3,4,6}};
        int[] dist = new int[vartax];

        dist[start-1] = 0;

        for(int i=1; i<dist.length; i++){
            dist[i] = INF;
        }

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[0].length; j++){
                dp[graph[i][0]-1][graph[i][1]-1] = graph[i][2];
            }
        }

        for(int i=0; i<vartax; i++){
            for(int j=0; j<vartax; j++){
                if(i==j){
                    dp[i][j] = 0;
                    continue;
                }
                if(dp[i][j]==0) dp[i][j] = INF;
            }
        }

        boolean[] visited = new boolean[vartax];
        visited[start-1] = true;

        for(int i=0; i<vartax; i++){
            for(int j=1; j<vartax; j++){
                dist[j] = Math.min(dist[j], dist[i]+dp[i][j]);
            }
        }

        for(int i:dist){
            System.out.print(i+" ");
        }
        System.out.println();
        /*
        for(int[] i: dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */
    }
    /* Floyd Washal
    public static void main(String[] args){
        int vartax = 5;
        int edge = 6;
        int start = 1;
        int[][] graph = {{5,1,1},{1,2,2},{1,3,3},{2,3,4},{2,4,5},{3,4,6}};
        int[][] dp = new int[vartax][vartax];

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[0].length; j++){
                dp[graph[i][0]-1][graph[i][1]-1] = graph[i][2];
            }
        }

        for(int i=0; i<vartax; i++){
            for(int j=0; j<vartax; j++){
                if(i==j){
                    dp[i][j] = 0;
                    continue;
                }
                if(dp[i][j]==0) dp[i][j] = INF;
            }
        }

        for(int k=0; k<vartax; k++){
            for(int i=0; i<vartax; i++){
                for(int j=0; j<vartax; j++){
                    if(dp[i][k]+dp[k][j]<dp[i][j]){
                        dp[i][j] = dp[i][k]+dp[k][j];
                    }
                }
            }
        }
        for(int[] i: dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    */
}
