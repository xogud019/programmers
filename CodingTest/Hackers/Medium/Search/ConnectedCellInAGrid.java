package CodingTest.Hackers.Medium.Search;
//dfs kakao track(bfs)
import java.io.*;
import java.util.*;

public class ConnectedCellInAGrid {
    static int[] pointX = {-1,-1,-1,0,1,1,1,0};
    static int[] pointY = {-1,0,1,1,1,0,-1,-1};
    static int tempVal = 0;
    
    // Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int answer = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(!visited[i][j]&&matrix[i][j]==1){
                    tempVal = 0;
                    dfs(i,j,matrix,visited);
                    answer = Math.max(tempVal, answer);
                }
            }
        }
        return answer; 
    }

    static void dfs(int x, int y, int[][] matrix, boolean[][] visited){
        tempVal++;
        visited[x][y] = true;

        for(int i=0; i<8; i++){
            int newX = x+pointX[i];
            int newY = y+pointY[i];

            if(newX>=0&&newY>=0&&newX<matrix.length&&newY<matrix[0].length&&!visited[newX][newY]&&matrix[newX][newY]==1){
                dfs(newX,newY,matrix,visited);
            }
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] matrixRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int matrixItem = Integer.parseInt(matrixRowItems[j]);
                matrix[i][j] = matrixItem;
            }
        }

        int result = connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
