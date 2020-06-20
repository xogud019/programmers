package level3;
import java.util.*;

public class IntermittentCamera {
    public static void main(String[] args){
        int[][] routes = {{0,1},{0,1},{2,2}};
        System.out.println(solution(routes));
    }

    public static int solution(int[][] routes){
        int answer = 1;
        //Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(routes,new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2){
                int val1 = a1[0];
                int val2 = a2[0];
                return val1-val2;
            }
        });

        int dst = routes[0][1];

        for(int i=0; i<routes.length; i++){
            if(dst>=routes[i][0]){
                dst = Math.min(dst, routes[i][1]);
            }
            else{
                answer++;
                dst = routes[i][1];
            }
        }
        return answer;
    }
    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}