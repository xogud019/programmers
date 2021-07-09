package CodingTest.Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

class GameOfThrone{
    static String gameOfThrones(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);

            if(!map.containsKey(temp)){
                map.put(temp,1);
            }
            else{
                map.put(temp,map.get(temp)+1);
            }
        }

        if(s.length()%2==0){
            for(char c : map.keySet()){
                if(map.get(c)%2==1){
                    return "NO";
                }
            }
        }
        else{
            int count = 0;
            for(char c : map.keySet()){
                if(map.get(c)%2==1){
                    count++;
                }
            }
            if(count>=2){
                return "NO";
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}