package Hackers.Easy.Strings;
import java.io.*;
import java.util.Scanner;

class MarsExploration{
    static int marsExploration(String s) {
        char[] arr = {'S','O','S'};
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=arr[i%3]) count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}