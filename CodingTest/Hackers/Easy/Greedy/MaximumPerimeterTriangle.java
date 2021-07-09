package CodingTest.Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class MaximumPerimeterTriangle {
    static int[] maximumPerimeterTriangle(int[] sticks) {
        int[] answer = new int[3];
        boolean isT = false;
        Arrays.sort(sticks);
        
        for(int j=sticks.length-1; j>=2; j--){
            if(sticks[j]<sticks[j-1]+sticks[j-2]){
                answer[0] = sticks[j-2];
                answer[1] = sticks[j-1];
                answer[2] = sticks[j];
                isT = true;
                break;
            }
        }

        if(isT){
            return answer;
        }
        else{
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] sticks = new int[n];

        String[] sticksItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksItems[i]);
            sticks[i] = sticksItem;
        }

        int[] result = maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}