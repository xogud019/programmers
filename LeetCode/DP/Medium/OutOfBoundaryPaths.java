package LeetCode.DP.Medium;
/*
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent four cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.

Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.

 

Example 1:


Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
Output: 6
Example 2:


Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
Output: 12
 

Constraints:

1 <= m, n <= 50
0 <= maxMove <= 50
0 <= startRow <= m
0 <= startColumn <= n
*/
public class OutOfBoundaryPaths {
    /*failed case - time limited
    //brute force = BFS
    static final int mod = 1000000007;
    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    
    class Ball{
        int x;
        int y;
        int move;
        
        public Ball(int x, int y, int move){
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Queue<Ball> q = new LinkedList<>();
        long answer = 0;
        boolean[][] visited = new boolean[m][n];
        
        q.add(new Ball(startRow, startColumn, 0));
        
        while(!q.isEmpty()){
            Ball ball = q.poll();
            ball.move++;
            
            for(int[] d:dir){
                int x = ball.x + d[0], y = ball.y + d[1];
                
                if(x < 0 || x >= m || y < 0 || y >= n){
                    if(ball.move <= maxMove) answer++;
                    continue;
                }
                
                if(ball.move < maxMove) q.add(new Ball(x, y, ball.move));
            }
        }
        
        return (int)(answer%mod);
    }
    */
    static final int mod = 1000000007;
    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int answer = 0;
        
        for(int k=0; k<maxMove; k++){
            int[][] temp = new int[m][n];
            
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    for(int[] d:dir){
                        int x = i + d[0], y = j + d[1];
                        
                        if(x < 0 || x >= m || y < 0 || y >= n) answer = (answer + dp[i][j])%mod;
                        else temp[x][y] = (temp[x][y] + dp[i][j])%mod;
                    }
                }
            }
            
            dp = temp;
        }
        
        return answer;
    }
}
