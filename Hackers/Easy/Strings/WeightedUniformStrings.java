package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class WeightedUniformStrings {
    static String[] weightedUniformStrings(String s, int[] queries) {
        Set<Integer> set = new HashSet<>();
        String[] answer = new String[queries.length];
        int cur = 0;
        char prev = 0;
        
        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);

            if(now!=prev){
                cur = now - 'a' + 1;
            }
            else{
                cur += now -'a' + 1;
            }

            set.add(cur);
            prev = now;
        }
        
        for(int i=0; i<queries.length; i++){
            if(set.contains(queries[i])) answer[i] = "Yes";
            else answer[i] = "No";
        }
        return answer;
    }
    /*failed case -> time out (if using a list and to is ouccured use a set)
    static String[] weightedUniformStrings(String s, int[] queries) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        char prev =0;
        String[] answer = {"ss","ss"};

        for(int i=0; i<26; i++){
            map.put((char)('a'+i),i+1);
        }

        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);

            if(prev!=now){
                list.add(map.get(now));
                prev = now;
            }
            else if(prev==now){
                list.add(list.get(i-1)+map.get(now));
            }
        }

        for(int i:list){
            System.out.println(i);
        }

        return answer;
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}