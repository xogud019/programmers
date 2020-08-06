package Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class SherlockAndSquares {
    static int squares(int a, int b) {
        int answer = 0;
        int start = (int)Math.sqrt(a);
        int end = (int)Math.sqrt(b);
        
        for(int i=start+1; i<=end; i++){
            answer++;
        }

        return (int)Math.sqrt(a)==Math.sqrt(a)?answer+1:answer;
    }
//3 22
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}