package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class CaesarCiphe {
    static String caesarCipher(String s, int k) {
        int idx = (int)'z';
        int IDX = (int)'Z';
        String answer = "";
        k %= 26;
        
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            int tpN = (int)temp + k;

            if(temp>='a'&&temp<='z'){
                if(tpN>idx){
                    tpN -= 26;
                }
                
                answer += (char)tpN;
            }
            else if(temp>='A'&&temp<='Z'){
                if(tpN>IDX){
                    tpN -= 26;
                }
                
                answer += (char)tpN;
            }
            else{
                answer += temp;
            }
        }

        return answer;
    }

//Lipps_Asvph!
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}