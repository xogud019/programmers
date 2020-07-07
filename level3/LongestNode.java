package level3;

public class LongestNode{
    public static void main(String[] args){
        int n = 6;
        int[][] vertax = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(solution(n, vertax));
    }

    public static int solution(int n, int[][] edge){
        int answer = 0;
        int max = 20001;
        int[][] board = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    board[i][j]=0;
                    continue;
                }
                board[i][j]= max;
            }
        }

        for(int i=0; i<edge.length; i++){
            if(board[edge[i][0]-1][edge[i][1]-1]<1) continue;
            board[edge[i][0]-1][edge[i][1]-1]=1;
            board[edge[i][1]-1][edge[i][0]-1]=1;
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==j) continue;
                    if(board[i][j]>board[i][k]+board[k][j]){
                        board[i][j]=board[i][k]+board[k][j];
                    }
                }
            }
        }

        int val = 0;
        for(int i=0; i<board.length; i++){
            if(val<board[0][i]){
                val=board[0][i];
                answer=1;
            }
            else if(val==board[0][i]){
                answer++;
            }
        }

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