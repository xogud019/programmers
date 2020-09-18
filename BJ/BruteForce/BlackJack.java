package BJ.BruteForce;
import java.util.*;

public class BlackJack {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int M = scan.nextInt();
        int[] card = new int[n];
        int answer = 0;
        
        for(int i=0; i<n; i++){
            card[i] = scan.nextInt();    
        }
        
        scan.close();
        
        for(int i=0; i<n-2; ++i){
            for(int j=i+1; j<n-1; ++j){
                for(int k=j+1; k<n; ++k){
                    if(card[i]+card[j]+card[k]<=M){
                        answer = Math.max(answer,card[i]+card[j]+card[k]);
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}
