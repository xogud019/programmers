package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class BeautifulBinaryString {
    //do not making easy problem to difficult
    static int beautifulBinaryString(String b) {
        int answer = 0;
        char[] arr = b.toCharArray();

        for(int i=2; i<arr.length; i++){
            if(arr[i-2]=='0'&&arr[i-1]=='1'&&arr[i]=='0'){
                answer++;
                arr[i] = '1';
            }
        }

        return answer;
    }
    /*failed case -> wrong answer
    static int beautifulBinaryString(String b) {
        String[] bin = {"0","1","0"};
        int idx = 0 ;
        int bLen = 3 ;
        int answer = 0;

        String[] temp = b.split("010");

        for(String k:temp){
            System.out.println(k);
        }

        if(temp.length==1){
            return 0;
        }
        else return temp.length;
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}