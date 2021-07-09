package CodingTest.Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class ACMTeam {
    static int[] acmTeam(String[] topic) {
        int[] answer= new int[2];
        int max = 0;
        int count = 0;
        for(int i=0; i<topic.length-1; i++){
            for(int j=i+1; j<topic.length; j++){
                int tot = 0;

                for(int k=0; k<topic[i].length(); k++){
                    if(topic[i].charAt(k)=='1'||topic[j].charAt(k)=='1'){
                        tot++;
                    }
                }

                if(tot>max){
                    max= tot;
                    count = 1;
                }
                else if(tot==max){
                    count++;
                }
            }
        }

        answer[0] = max;
        answer[1] = count;
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}