package BJ.BruteForce;
import java.util.Scanner;

public class Body {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] arr = new int[n][2];
        int[] rank = new int[n];
        
        for(int i=0; i<rank.length; i++){
            rank[i] = 1;
        }
        for(int i=0; i<n; i++){
            arr[i][0] =scan.nextInt();
            arr[i][1] =scan.nextInt();
        }
        
        scan.close();

        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr.length; ++j){
                if(i==j) continue;
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    rank[i] +=1;
                }
            }
        }

        for(int i: rank){
            System.out.print(i+" ");
        }
    }
}
