package BJ.BruteForce;
import java.util.*;

public class Decomposition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = 0;
        scan.close();

        for(int i=1; i<n; i++){
            int sum = i;
            int count = i;

            while(count>0){
                sum+= count%10;
                count/=10;
            }
            
            if(sum==n){
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
        return;
    }
}
