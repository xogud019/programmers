package CodingTest.BJ.BruteForce;
import java.util.Scanner;

public class OTTPlus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i=0; i<t; i++){
            int n = scan.nextInt();
            int answer = dfs(n);
            System.out.println(answer);
        }
        
        scan.close();
    }

    public static int dfs(int n){
        if(n==0) return 1;
        if(n<0) return 0;

        return dfs(n-1)+dfs(n-2)+dfs(n-3);
    }
}
