package Hackers.Medium.Greedy;
import java.io.*;
import java.util.*;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map= new HashMap<>();
        int idx =0;
        int answer = 0;
        int mul = 0;

        for(int i=0; i<c.length; i++){
            list.add(c[i]);
        }

        Collections.sort(list, Collections.reverseOrder());

        while(idx<list.size()){
            if(idx!=0&&idx%k==0){
                mul++;
            }
            if(!map.containsKey(idx%k)){
                map.put(idx%k,list.get(idx)*(mul+1));
            }
            else{
                map.put(idx%k,map.get(idx%k)+list.get(idx)*(mul+1));
            }
            idx++;
        }

        for(int i:map.keySet()){
            answer += map.get(i);
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}