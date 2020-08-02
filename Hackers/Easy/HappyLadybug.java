package Hackers.Easy;
import java.io.*;
import java.util.*;

public class HappyLadybug {
    static String happyLadybugs(String b) {
        Map<Character, Integer> map= new HashMap<>();
        int under = 0;

        for(int i=0; i<b.length(); i++){
            char k = b.charAt(i);

            if(k=='_'){
                under++;
                continue;
            } 

            if(!map.containsKey(k)){
                map.put(k,1);
            }
            else{
                map.put(k,map.get(k)+1);
            }
        }

        if(map.size()==0&&under>0){
            return "YES";
        }
        

        for(char c : map.keySet()){
            if(map.get(c)<2) return "NO";
        }

        if(under>0){
            return "YES";
        }
        else{
            int count = 1;
            for(int i=0; i<b.length()-1; i++){
                if(b.charAt(i)==b.charAt(i+1)){
                    count++;
                    continue;
                }

                if(count<2&&(b.charAt(i)!=b.charAt(i+1))){
                    return "NO";
                }
                else if(count>=2&&(b.charAt(i)!=b.charAt(i+1))){
                    count=1;
                }
            }

            return "YES";
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}