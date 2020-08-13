package Hackers.Medium.DictionAndHashMap;

import java.io.*;
import java.util.*;

public class SherlockandAnagrams {
    static int sherlockAndAnagrams(String s) {
        int len = s.length();
        int answer = 0;
        List<String> list = new ArrayList<>();

        for(int i=0; i<len; i++){
            for(int j= i+1; j<len+1; j++){
                list.add(s.substring(i,j));
            }
        }
       
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(check(list.get(i),list.get(j))) answer++;
            }
        }
        return answer;
    }

    static boolean check(String s1, String s2){
        if(s1.length()!=s2.length()) return false;

        int count = 0;
        boolean[] visited = new boolean[s2.length()];
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)&&!visited[j]){
                    count++;
                    visited[j] = true;
                    break;
                }
            }
        }

        return count==s2.length()?true:false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}