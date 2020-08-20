package Hackers.Easy.Strings;
import java.io.*;
import java.util.Scanner;

public class CamelCase {
    static int camelcase(String s) {
        String[] temp = s.split("[A-Z]");
        return temp.length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}