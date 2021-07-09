package CodingTest.Programmers.level3;

//study dijkstra, FloydWarshall

//not
public class Delivery {
    
    public static void main(String[] args){
        int N = 5;
        int K = 3;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        
        System.out.println(solution(N, road, K));
    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        int max = 500001;
        int[][] board = new int[N][N];
        int row = board.length;
        int col = board[0].length;
        
        print(road);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j){
                    board[i][j] = 0;
                    continue;
                }
                board[i][j] = max;
            }
        }
        for(int i=0; i<road.length; i++){
            if(board[road[i][0]-1][road[i][1]-1]<road[i][2]) continue;
            board[road[i][0]-1][road[i][1]-1]= road[i][2];
            board[road[i][1]-1][road[i][0]-1]= road[i][2];
        }

        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==j) continue;
                    if(board[i][j]>board[i][k]+board[k][j]){
                        board[i][j]=board[i][k]+board[k][j];
                    }
                }
            }
        }

        for(int i=0; i<row; i++){
            if(board[0][i]<=K){
                answer++;
            }
        }
        print(board);
        return answer;
    }
    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}