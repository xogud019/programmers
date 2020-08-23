package Hackers.Easy.Sort;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//not yet
public class CountingSort {
    static void countSort(List<List<String>> arr) {
        int n = arr.size();
        List<String> list = new ArrayList<>();

        for(int i=0; i<arr.size(); ++i){
            if(i<n/2){
                //System.out.println("1111");
                arr.get(i).set(1,"-");
            }
        }

        
        //Collections.sort(arr);

        for(int i=0;i<arr.size(); ++i){
            System.out.println(arr.get(i));
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