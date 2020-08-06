package Hackers.Easy.Implementation;

import java.io.*;
import java.util.*;

public class CutTheStick {
    static int[] cutTheSticks(int[] arr) {
        int[] answer = {};
        List<Integer> list= new ArrayList<>();
        List<Integer> len= new ArrayList<>();
        
        for(int i:arr){
            list.add(i);
        }
        
        len.add(list.size());

        while(true){
            int min = Collections.min(list);
            
            for(int i=0; i<list.size(); i++){
                list.set(i,list.get(i)-min);
                if(list.get(i)==0){
                    list.remove(i);
                    i--;
                }
            }
            if(list.size()!=0){
                len.add(list.size());
            }
            if(list.size()==1||list.size()==0){
                break;
            }

        }

        answer = new int[len.size()];

        for(int i=0; i<answer.length; i++){
            answer[i]=len.get(i);
        }
        
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

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