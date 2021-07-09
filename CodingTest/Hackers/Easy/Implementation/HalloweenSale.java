package CodingTest.Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class HalloweenSale{
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int answer = 0;
        int tot = 0;

        while(tot<=s){
            tot +=p;
            if(p-d>=m){
                p -=d;
            }
            else{
                p = m;
            }
            answer++;
        }

        return answer-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}