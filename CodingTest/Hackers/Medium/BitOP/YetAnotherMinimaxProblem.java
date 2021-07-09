package CodingTest.Hackers.Medium.BitOP;
import java.io.*;
import java.util.*;

public class YetAnotherMinimaxProblem {
    static int answer = Integer.MAX_VALUE;
    // Complete the anotherMinimaxProblem function below.
    //failed case -> time out
    static int anotherMinimaxProblem(int[] a) {
        dfs(a,0,a.length);

        return answer;
    }

    static void dfs(int[] a, int dep, int max){
        if(dep==max){
            
            int temp = 0;
            for(int i=0; i<max-1; i++){
                temp = Math.max(temp, a[i]^a[i+1]);
            }
            
            answer = Math.min(answer,temp);
            
            for(int i:a){
                System.out.print(i);
            }
            System.out.println("  "+temp);
            
            return;
        }

        for(int i=dep; i<max; i++){
            swap(a, i, dep);
            dfs(a, dep+1, max);
            swap(a, i, dep);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = anotherMinimaxProblem(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
