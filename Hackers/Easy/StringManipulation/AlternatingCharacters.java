package Hackers.Easy.StringManipulation;
import java.io.*;
import java.util.*;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int answer = 0;
        int len = s.length();

        for(int i=1; i<len; i++){
            if(s.charAt(i-1)==s.charAt(i)) answer++;
        }
        
        return answer;
    }
    /*failed case -> time out
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        
        String result = ""+s.charAt(0);
        int idx = 0;

        for(int i=1; i<s.length(); i++){
            if(result.charAt(idx)==s.charAt(i)) continue;
            else {
                result += s.charAt(i);
                idx++;
            }
        }

        return s.length()-result.length();
        
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}