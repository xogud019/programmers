package Hackers.Easy.String;
import java.io.*;

public class SuperReducedString {
    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        String answer = "";
        
        for(int i=1; i<sb.length(); i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1,i+1);
                i=0;
            }
        }

        if(sb.length()==0){
            answer = "Empty String";    
        }
        else{
            answer = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}