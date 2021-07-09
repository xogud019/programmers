package CodingTest.Hackers.Easy.StringManipulation;
import java.io.*;
import java.util.*;

public class MakingAnagrams {
    static int makeAnagram(String a, String b) {
        int answer = a.length()+b.length();
        String[] a1 = a.split("");
        String[] b1 = b.split("");

        for(int i=0; i<a1.length; i++){

            for(int j=0; j<b1.length; j++){
                if(b1[j]=="*") continue;

                if(a1[i].equals(b1[j])){
                    answer -=2;
                    a1[i]="*";
                    b1[j]="*";
                }
            }
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}