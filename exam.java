import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exam {
    static class Man{
        int in =0 ;
        int count = -1;

        public Man(int in){
            this.in = in;
        }
    }
    public static void main(String[] args){
        int[][] enter = {{1,3,2},{1,4,2,3},{3,2,1},{3,2,1},{1,4,2,3}}, leave = {{1,2,3},{2,1,3,4},{2,1,3},{1,3,2},{2,1,4,3}};

        for(int i=0; i<enter.length; i++){
            int[] arr = solution(enter[i], leave[i]);
            print(arr);
        }
    }

    public static int[] solution(int[] enter, int[] leave){
        int len = enter.length;
        int[] answer  = new int[len];
        
        return answer;
    }

    public static void print(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        
        System.out.println();
        
        return;
    }
}
