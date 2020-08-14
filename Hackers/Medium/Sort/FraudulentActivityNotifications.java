package Hackers.Medium.Sort;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Map.Entry;
//using counting sort
public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d) {
        int answer = 0;
        
        return answer;
    }
    /*failed case -> time out;
    static int activityNotifications(int[] expenditure, int d) {
        int answer = 0;
        int[] arr = expenditure;
        Map<Integer, Integer> map;
        int mid = (d%2==0)?d/2:d/2+1;
        
        for(int i=0; i<arr.length-d; i++){
            double midVal = 0;
            map = new TreeMap<>();
            int tot = 0;

            for(int j=i; j<d+i; j++){
                if(!map.containsKey(arr[j])){
                    map.put(arr[j],1);
                }
                else map.put(arr[j], map.get(arr[j])+1);
            }

            for(Entry<Integer,Integer> entry:map.entrySet()){
                tot+=entry.getValue();
                if(tot>=mid){
                    if(d%2==1){
                        midVal = entry.getKey();
                        break;
                    }
                    else{
                        midVal =(double)(entry.getKey()*2+1)/2;
                        break;
                    }
                    
                }
            }

            if(arr[d+i]>=2*midVal){
                answer++;
            }
        }

        return answer;
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}