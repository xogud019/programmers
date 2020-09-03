package Hackers.Hard.Graph;
import java.io.*;
import java.util.*;

public class ConnectedCellinaGrid {
    static int maxRegion(int[][] grid) {
        int row = grid.length; 
        int col = grid[0].length;
        int answer = 0;

        for(int i=0; i<row; ++i){
            for(int j=0; j<col; ++j){
                answer = Math.max(answer,countCell(i,j,grid));
            }
        }

        return answer;
    }

    static int countCell(int x, int y, int[][] grid){
        if(x<0||y<0||x>grid.length-1||y>grid[0].length-1) return 0;
        if(grid[x][y]==0) return 0;

        grid[x][y] = 0;

        return 1
        +countCell(x-1,y-1,grid)//7
        +countCell(x-1,y,grid)//8
        +countCell(x-1,y+1,grid)//9
        +countCell(x,y+1,grid)//6
        +countCell(x+1,y+1,grid)//3
        +countCell(x+1,y,grid)//2
        +countCell(x+1,y-1,grid)//1
        +countCell(x,y-1,grid);//4
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] gridRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int gridItem = Integer.parseInt(gridRowItems[j]);
                grid[i][j] = gridItem;
            }
        }

        int res = maxRegion(grid);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
