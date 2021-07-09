package Note;

public class FW {
    static int INF = 10000000;
    public static void main(String[] args){
        int[][] arr = {{0,5,INF, 8},{7,0,9,INF},{2,INF, 0, 4},{INF, INF, 3, 0}};
        int n = arr.length;

        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = arr[i][j];
            }
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(dp[i][k]+dp[k][j]<dp[i][j]) dp[i][j] = dp[i][k]+dp[k][j];
                }
            }
        }

        for(int[] i:dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
