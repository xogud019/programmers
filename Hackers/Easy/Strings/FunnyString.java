package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class FunnyString {
    static String funnyString(String s) {
        int len = s.length();
        int[] forward = new int[len];
        int[] backward = new int[len];

        for(int i=0; i<len; i++){
            forward[i] = (int)s.charAt(i);
            backward[len-1-i] = (int)s.charAt(i);
        }

        for(int i=0; i<len-1; i++){
            if(Math.abs(forward[i+1]-forward[i])!=Math.abs(backward[i+1]-backward[i])) return "Not Funny";
        }
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}