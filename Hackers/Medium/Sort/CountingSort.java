package Hackers.Medium.Sort;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
//not yet
public class CountingSort {
    static void countSort(List<List<String>> arr) {
        int n = arr.size();
        StringBuffer[] count = new StringBuffer[100];

        for(int i=0; i<count.length; i++) count[i] = new StringBuffer();
        
        for(int i=0; i<arr.size(); ++i){
            int k = Integer.parseInt(arr.get(i).get(0));

            if(i<n/2){
                count[k] = count[k].append("- ");
            }
            else count[k] = count[k].append(arr.get(i).get(1)+" ");
        }

        for(int i=0; i<100; i++){
            System.out.print(count[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        countSort(arr);

        bufferedReader.close();
    }
}