package Hackers.Easy.BitOp;
import java.io.*;
//study

public class SumVSXOR {
    /*failed case -> time out
    static long sumXor(long n){
        long answer = 0;

        for(int i=0; i<=n; i++){
            if(n+i==(n^i)) answer;;
        }

        return answer;
    }
    */
    static long sumXor(long n) {
        long answer = 0;

        while(n>0){
            if((n&1)==0) answer++;
            n = n>>1;
        }

        return (long)Math.pow(2,answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
