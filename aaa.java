import java.util.*;
public class aaa {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        
        int n = 5;
        int[] answer;
        int x = -1;
        int y = 0;
        int num=1;
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i%3 == 0) x++;
                else if(i%3 == 1) y++;
                else if(i%3 == 2){
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }

        for(int[] i: arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
