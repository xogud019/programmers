package Hackers.Easy;
import java.io.*;
import java.util.*;

public class CavityMap{
    static String[] cavityMap(String[] grid) {
        String[][] board = new String[grid.length][grid[0].length()];
        String[] answer = new String[grid.length];

        for(int i=0; i<answer.length; i++){
            answer[i] ="";
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length(); j++){
                board[i][j] = ""+grid[i].charAt(j);
            }
        }

        for(int i=1; i<board.length-1; i++){
            for(int j=1; j<board[i].length-1; j++){
                if((!board[i-1][j].equals("X")&&Integer.parseInt(board[i][j])>Integer.parseInt(board[i-1][j]))&&
                (!board[i+1][j].equals("X")&&Integer.parseInt(board[i][j])>Integer.parseInt(board[i+1][j]))&&
                (!board[i][j-1].equals("X")&&Integer.parseInt(board[i][j])>Integer.parseInt(board[i][j-1]))&&
                (!board[i][j+1].equals("X")&&Integer.parseInt(board[i][j])>Integer.parseInt(board[i][j+1]))){
                    board[i][j]= "X";
                }
                
            }
        }

        for(int i = 0; i < board.length; i ++) {
            for(int j= 0; j< board[0].length; j ++) { 
                answer[i] += board[i][j];
            }
        }
        return answer;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}