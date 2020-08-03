package Hackers.Medium;
import java.io.*;
import java.util.*;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
        int[] answer = {};

        if(k==0){
            answer = new int[n];

            for(int i=0; i<n; i++){
                answer[i] = i+1;
            }

            return answer;
        }
        else if(n%(2*k)==0){
            answer = new int[n];

            for(int i=1; i<=n; i++){
                int val = (i%(2*k)==0)?2*k:i%(2*k);
                if(val<=k) answer[i-1] = i+k;
                else answer[i-1] = i-k;
            }

            return answer;
        }
        else{
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}