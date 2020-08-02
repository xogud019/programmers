package Hackers.Easy;
import java.io.*;
import java.util.*;

public class StrangeCounter {
    static long strangeCounter(long t) {
        long i= 1;
        
        while(t>=findStart(i)){
            i++;
        }
        i--;
        
        long value = findStart(i+1)-findStart(i);

        return value - (t-findStart(i));
    }

    static long findStart(long t){
        long n = 1;
        for(long i=0; i<t-1; i++){
            n+= Math.pow(2,i)*3;
        }

        return n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}