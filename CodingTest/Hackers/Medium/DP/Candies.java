package CodingTest.Hackers.Medium.DP;
import java.io.*;
import java.util.*;

public class Candies {
    static long candies(int n, int[] arr) {
        long answer = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]) dp[i] = dp[i-1]+1;
            else dp[i] = 1;
        }
        
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>arr[i+1]&&dp[i]<=dp[i+1]) dp[i] = dp[i+1]+1;
        }
        
        
        for(int i:dp){
            answer+=i;
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
