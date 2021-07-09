package CodingTest.Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class LoveLetterMystery {
    static int theLoveLetterMystery(String s) {
        int start = 0;
        int end = s.length()-1;
        int answer = 0;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                answer+= Math.abs((int)s.charAt(start)-(int)s.charAt(end));
            }
            start++;
            end--;
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}