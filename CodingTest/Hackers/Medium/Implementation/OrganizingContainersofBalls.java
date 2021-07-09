package CodingTest.Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class OrganizingContainersofBalls {
    static String organizingContainers(int[][] container) {
        int row = container.length;
        int col = container[0].length;
        int[] conTot = new int[row];
        int[] ballTot = new int[col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                conTot[i] += container[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ballTot[i] += container[j][i];
            }
        }
        
        Arrays.sort(conTot);
        Arrays.sort(ballTot);

        return Arrays.equals(conTot, ballTot)? "Possible":"Impossible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}