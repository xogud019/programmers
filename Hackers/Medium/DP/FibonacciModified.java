package Hackers.Medium.DP;
import java.io.*;
import java.math.*;
import java.util.*;

public class FibonacciModified {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger[] arr = new BigInteger[n];
        arr[0] = BigInteger.valueOf(t1);
        arr[1] = BigInteger.valueOf(t2);

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1].multiply(arr[i-1]).add(arr[i-2]);
        }

        bufferedWriter.write(String.valueOf(arr[n-1]));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
