package CodingTest.Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        if(n==c.length){
            return 0;
        }

        int answer = 0;

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;

            for(int j=0; j<c.length; j++){
                min = Math.min(min,Math.abs(c[j]-i));
            }
            if(min>answer){
                answer = min;
            }
        }
        

        return answer;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}