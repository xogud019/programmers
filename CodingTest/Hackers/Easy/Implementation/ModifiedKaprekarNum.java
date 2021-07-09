package CodingTest.Hackers.Easy.Implementation;
import java.util.*;

public class ModifiedKaprekarNum {
    static void kaprekarNumbers(int p, int q) {
        List<Integer> list = new ArrayList<>();

        for(int i=p; i<=q; i++){
            if(i==1){
                list.add(1);
                continue;
            }
            if(i<=8){
                continue;
            }
            long n = (long)i*i;
            String num = Long.toString(n);
            int len = num.length();

            int pre = Integer.parseInt(num.substring(0,len/2));
            int last = Integer.parseInt(num.substring(len/2,len));

            if(pre+last==i){
                list.add(i);
            }
            
        }
        if(list.isEmpty()){
            System.out.print("INVALID RANGE");
            return;
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}