package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class MakingAnagrams {
    static int makingAnagrams(String s1, String s2) {
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);
        int count = 0;
        for(int i=0; i<sb1.length(); i++){
            for(int j=0; j<sb2.length(); j++){
                if(sb1.charAt(i)==sb2.charAt(j)){
                    sb2 = sb2.deleteCharAt(j);
                    count++;
                    j--;
                    break;
                }
            }
        }        

        return (sb1.length()-count)+sb2.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}