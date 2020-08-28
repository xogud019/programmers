package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class StringConstruction {
    static int stringConstruction(String s) {
        StringBuffer sb = new StringBuffer(s);
        String ss ="";
        StringBuffer p = new StringBuffer(ss);
        int answer = 0;

        for(int i=0; i<sb.length(); i++){
            String c = Character.toString(sb.charAt(i));

            if(p.indexOf(c)==-1){
                p.append(c);
                answer++;
            }
            else{
                p.append(c);
            }
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

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}