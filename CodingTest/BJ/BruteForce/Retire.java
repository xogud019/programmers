package CodingTest.BJ.BruteForce;
import java.util.Scanner;
//not yet
public class Retire {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int n = 7;
        int answer = 0;
        int[][] arr = new int[n][2];

        //int[][] arr = {{3,10},{5,20},{1,10},{1,20},{2,15},{4,40},{2,200}};
        
        for(int i=0; i<arr.length; ++i){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        
        scan.close();
        
        
        
        System.out.println(answer);
        return;
    }
}
