import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class exam {
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
        Queue<Integer> out = new LinkedList<>();
        List<Integer> in = new LinkedList<>();

        Arrays.fill(answer, -1);

        for(int i:leave) out.add(i);

        for(int en:enter){
            in.add(en);
            int size = in.size();
            answer[in.get(in.size()-1)-1] += size-1;

            for(int i:in) answer[i-1]++;
    
            while(in.contains(out.peek())){
                int idx = out.poll();

                for(int i=0; i<in.size(); i++){
                    if(idx == in.get(i)){
                        idx = i;
                        break;
                    }
                }

                in.remove(idx);
            }
        }

        return answer;
    }

    public static void print(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        
        System.out.println();
        
        return;
    }
}
