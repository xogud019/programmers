package level3;
import java.util.*;

public class HanoiTower {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        int n = 2;
        int[][] result = solution(n);

        print(result);
    }

    public static int[][] solution(int n){
        hanoi(n, 1, 2, 3);
        int[][] answer = new int[list.size()][2];
        
        for(int i=0; i<list.size(); i++){
            String[] s = list.get(i).split(",");
            answer[i][0] = Integer.parseInt(s[0]);
            answer[i][1] = Integer.parseInt(s[1]);
        }
        return answer;
    }

    public static void hanoi(int n,int from, int temp, int to){
        if(n==1){
            list.add(from+","+to);
            return;
        }
        else{
            hanoi(n-1, from, to, temp);
            list.add(from+","+to);
            hanoi(n-1, temp, from, to);
        }
    }
    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}