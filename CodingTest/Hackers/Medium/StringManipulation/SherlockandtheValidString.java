package CodingTest.Hackers.Medium.StringManipulation;
import java.io.*;
import java.util.*;

public class SherlockandtheValidString {
    static String isValid(String s) {
        Map<String,Integer> map = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            String ss = Character.toString(s.charAt(i));

            if(!map.containsKey(ss)){
                map.put(ss,1);
            }
            else{
                map.put(ss,map.get(ss)+1);
            }
        }

        for(String k:map.keySet()){
            if(!freq.containsKey(map.get(k))){
                freq.put(map.get(k),1);
            }
            else{
                freq.put(map.get(k),freq.get(map.get(k))+1);
            }
        }
        
        for(int i:freq.keySet()){
            System.out.println(i+" "+freq.get(i));
        }

        if(freq.size()==1){
            return "YES";
        }
        else if(freq.size()==2){
            int[] key = new int[2];
            int idx = 0;
            for(int i:freq.keySet()){
                key[idx] = i;
                idx++;
            }

            Arrays.sort(key);
            
            if(key[0]==1&&freq.get(1)==1){
                return "YES";
            }
            else if(key[1]-key[0]==1&&freq.get(key[1])==1){
                return "YES";
            }
            else return "NO";

        }
        else{
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}