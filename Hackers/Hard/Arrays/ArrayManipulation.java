package Hackers.Hard.Arrays;
import java.io.*;
import java.util.*;

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long answer= 0;
        long temp = 0;
        long[] arr = new long[n];
        for(int i=0; i<queries.length; i++){
            arr[queries[i][0]-1]+=queries[i][2];
            if(queries[i][1]<n){
                arr[queries[i][1]]-=queries[i][2];
            }
        }

        for(int i=0; i<arr.length; i++){
            temp+=arr[i];
            answer = Math.max(answer, temp);
        }
        
        return answer;
    }
    /*failed case2 ->time out
    static long arrayManipulation(int n, int[][] queries) {
        long answer= 0;
        Map<Long, Long> map = new HashMap<>();

        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]-1; j<=queries[i][1]-1; j++){
                if(!map.containsKey(Long.valueOf(j))){
                    map.put(Long.valueOf(j),Long.valueOf(queries[i][2]));
                }
                else{
                    map.put(Long.valueOf(j),map.get(Long.valueOf(j))+queries[i][2]);
                }
            }
        }

        for(long i:map.keySet()){
            if(answer<map.get(i)){
                answer= map.get(i);
            }
        }
        return answer;
    }
    */
    /*failed case -> time out;
    static long arrayManipulation(int n, int[][] queries) {
        long[][] arr = new long[1][n];
        long answer= 0;
        
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]-1; j<=queries[i][1]-1; j++){
                arr[0][j] +=queries[i][2];
            }
        }

        for(long[] i:arr){
            for(long j:i){
                if(j>answer){
                    answer = j;
                }
            }
        }
        return answer;

    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}