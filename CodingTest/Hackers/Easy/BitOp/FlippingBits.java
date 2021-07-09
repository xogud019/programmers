package CodingTest.Hackers.Easy.BitOp;
import java.io.*;
import java.util.*;

public class FlippingBits {
    static long flippingBits(long n) {
        int[] bit = new int[32];
        long answer = 0;

        for(int i=0; i<32; ++i){
            bit[i] = (int)((n%2)^1);
            //bit[i] = bit[i]^1;
            n /=2;
            
            if(bit[i]==1) answer+= (long)Math.pow(2,i);
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
