package CodingTest.Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class GridChallenge {
    static String gridChallenge(String[] grid) {
        char[][] arr = new char[grid.length][grid[0].length()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = grid[i].toCharArray();
            Arrays.sort(arr[i]);
        }

        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i][j]>arr[i+1][j]) return "NO";
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}