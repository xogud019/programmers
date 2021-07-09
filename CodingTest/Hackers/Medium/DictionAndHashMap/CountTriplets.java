package CodingTest.Hackers.Medium.DictionAndHashMap;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
//study
public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        long answer = 0;
        long start = 0;
        Map<Long, Long> mid = new HashMap<>();
        Map<Long, Long> end = new HashMap<>();

        for(int i=0; i<arr.size(); i++){
            start = arr.get(i);
            answer += end.getOrDefault(start,0L);

            if(mid.containsKey(start)){
                end.put(start*r,end.getOrDefault(start*r, 0L)+mid.get(start));
            }
            
            mid.put(start*r,mid.getOrDefault(start*r, 0L)+1);
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}