package Hackers.Easy.JavaPrac;
import java.util.*;

public class Expression {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            if(emailID.contains("@gmail.com")){
                list.add(firstName);
            }
            /*
            String[] temp = (firstName+" "+emailID).split("@");

            if(temp[1].equals("gmail.com")){
                String[] temp1 = temp[0].split(" ");
                list.add(temp1[0]);
            }
            */
        }

        Collections.sort(list);
        
        for(String i:list){
            System.out.println(i);
        }

        scanner.close();
    }
}
