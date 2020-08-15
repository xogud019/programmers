package Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        int count=0;
        for(int i=0; i<contests.length; i++){
            if(contests[i][1]==0){
                answer +=contests[i][0];
            }
            else{
                list.add(contests[i][0]);
            }
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i:list){
            if(count>=k){
                answer+= i*(-1);
            }
            else{
                answer+=i;
            }
            count++;
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}