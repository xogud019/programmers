package Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long len = (long)s.length();
        int count = 0;
        char[] c = s.toCharArray();
        long div = n/len;
        long lest = 0;

        for(char cc:c){
            if(cc =='a'){
                count++;
            }
        }
      
        for(long i=1; i<=(n%len); i++){
            if(s.charAt((int)(i-1))=='a'){
                lest++;
            }
        }

        return count*div+lest;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}