package CodingTest.Hackers.JavaPrac.JavaSkill;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int idx = 1; 
        while(scan.hasNext()){
            System.out.println(idx+" "+scan.nextLine());
            idx++;
        }

        scan.close();
    }
}
