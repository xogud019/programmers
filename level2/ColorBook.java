package level2;
import java.util.*;

public class ColorBook {
    static int MAX = 0;
    public static void main(String[] args){
        int m = 6;
        int n = 4;
        int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,3,3}};
        int[] result = solution(m, n, picture);
        
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(int m, int n, int[][] picture){
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        Stack<Integer> XStack = new Stack<>();
        Stack<Integer> YStack = new Stack<>();
        
        
        
        return answer;
    }
}