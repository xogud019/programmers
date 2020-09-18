package Programmers.level3;


public class BackRoad {
    public static void main(String[] args){
        int m = 4;
        int n = 3;
        int[][] puddles ={{2,2}};

        System.out.println(solution(m, n, puddles));
    }

    public static int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[n+1][m+1];

        for(int i=0; i<puddles.length; i++){
            road[puddles[i][1]][puddles[i][0]]=-1;
        }

        road[1][1]=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(road[i][j]==-1){
                    continue;
                }
                if(road[i][j-1]>=0&&road[i][j]>=0){
                    road[i][j]+=road[i][j-1]%1000000007;
                }
                if(road[i-1][j]>=0&&road[i][j]>=0){
                    road[i][j]+=road[i-1][j]%1000000007;
                }
                
            }
        }

        return road[n][m]%1000000007;
    }

    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}