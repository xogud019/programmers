package CodingTest.Hackers.Medium.DictionAndHashMap;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int idx = 0;
        int val = 0;
        int max = 1;
        for(List<Integer> li:queries){
            idx = li.get(0);
            val = li.get(1);

            if(idx == 1){
                if(!map.containsKey(val)){
                    map.put(val,1);
                }
                else map.put(val,map.get(val)+1);

                if(map.get(val)>max){
                    max = map.get(val);
                }
            }
            else if(idx == 2){  
                if(map.size()==0){
                    continue;
                }
                if(!map.containsKey(val)){
                    continue;
                }
                else map.put(val,map.get(val)-1);

                if(map.get(val)<0){
                    map.remove(val);
                }
            }

            else if(idx == 3){
                if(val>max){
                    result.add(0);
                    continue;
                }
                if(map.size()==0){
                    result.add(0);
                    continue;
                }
                
                if(map.containsValue(val)){
                    result.add(1);
                }
                else result.add(0);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}