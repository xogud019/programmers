package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class StrongPwd {
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int answer = 0;
        Matcher m;

        Pattern p1 = Pattern.compile("[0-9]");
        m = p1.matcher(password);

        if(!m.find()){
            answer++;
        }

        Pattern p2 = Pattern.compile("[a-z]");
        m = p2.matcher(password);

        if(!m.find()){
            answer++;
        }

        Pattern p3 = Pattern.compile("[A-Z]");
        m = p3.matcher(password);

        if(!m.find()){
            answer++;
        }

        Pattern p4 = Pattern.compile("[!@#$%^&*()\\-+]");
        m = p4.matcher(password);

        if(!m.find()){
            answer++;
        }

        return 6>password.length()+answer?6-password.length():answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}