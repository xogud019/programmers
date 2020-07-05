package level3;
import java.util.*;
//study dijkstra
//not
public class Delivery {
    static List<Integer> vertax = new ArrayList<>();
    
    public static void main(String[] args){
        int N = 5;
        int K = 3;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        
        System.out.println(solution(N, road, K));
    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        Graph g = new Graph(N);

        for(int i=0; i<road.length; i++){
            g.input(road[i][0], road[i][1],road[i][2]);
        }
    
        g.dijkstra(1);

        for(int i:vertax){
            if(i<=K){
                answer++;
            }
        }
        return answer;
    }

    static class Graph{
        int n;
        int[][] map;

        public Graph(int n){
            this.n = n;
            this.map = new int[n+1][n+1];
        }

        public void input(int i, int j, int w){
            map[i][j] = w;
            map[j][i] = w;
        }

        public void dijkstra(int v){
            int[] distance = new int[n+1];
            boolean[] visited = new boolean[n+1];

            for(int i=1; i<=n; i++){
                distance[i]=Integer.MAX_VALUE;
            }

            distance[v] = 0;
            visited[v] = true;

            for(int i=1; i<=n; i++){
                if(!visited[i]&&map[v][i]!=0){
                    distance[i] = map[v][i];
                }
            }

            for(int i=0; i<n-1; i++){
                int min = Integer.MAX_VALUE;
                int idx = -1;

                for(int j=1; j<=n; j++){
                    if(!visited[j]&&distance[j]!=Integer.MAX_VALUE){
                        if(distance[j]<min){
                            min = distance[j];
                            idx = j;
                        }
                    }
                }

                visited[idx] = true;
                for(int j=1; j<=n; j++){
                    if(!visited[j]&&map[idx][j]!=0){
                        if(distance[j]>distance[idx]+map[idx][j]){
                            distance[j]=distance[idx]+map[idx][j];
                        }
                    }
                }
            }

            for(int i =1; i<=n; i++){
                vertax.add(distance[i]);
            }
        }
    }
}