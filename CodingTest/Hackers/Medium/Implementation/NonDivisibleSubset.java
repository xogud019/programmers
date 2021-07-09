package CodingTest.Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remains=new int[k];
        for (int i=0;i<s.size();i++){
            remains[s.get(i)%k]++;
        }
        int result=0;
        if (remains[0]>0){
            result++;
        }
        for (int i=1;i<remains.length;i++){
            if(i==(k-i)){
                result++;
            }else {
                if (remains[i]>=remains[k-i]){
                    result+=remains[i];
                }else {
                    result+=remains[k-i];
                }
                remains[i]=0;
                remains[k-i]=0;
            }
        }
        return result;
    }

}