package Hackers.Medium.BitOP;
import java.io.*;
import java.util.*;

public class ANDProduct {
    static long andProduct(long a, long b) {
        long answer = a;
        for(long i=a+1; i<=b; i++){
            answer &= i;
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int nItr = 0; nItr < n; nItr++) {
            String[] ab = scanner.nextLine().split(" ");

            long a = Long.parseLong(ab[0]);

            long b = Long.parseLong(ab[1]);

            long result = andProduct(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
