package Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class MarcsCakewalk {
    static long marcsCakewalk(int[] calorie) {
        List<Integer> list = new ArrayList<>();
        int len = calorie.length;
        long answer = 0;

        for(int i:calorie){
            list.add(i);
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i=0; i<len; i++){
            answer+= Math.pow(2,i)*list.get(i);
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}