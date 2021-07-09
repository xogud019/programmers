package CodingTest.Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class PriyankaAndToys {
    static int toys(int[] w) {
        Arrays.sort(w);
        int answer = 1;
        int base = w[0];
        
        for(int i=1; i<w.length; i++){
            if(w[i]-base <=4 ) continue;
            else{
                answer++;
                base = w[i];
            }
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];

        String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}