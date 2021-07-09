package Note;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    List<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args){
        int[] dist = {1,3,5,10};
        boolean[] visited = new boolean[dist.length];
        dfs(dist, visited, 0);

    }

    public static void dfs(int[] dist, boolean[] visited, int index){
        if(index == dist.length){
            for(int i=0; i<dist.length; i++){
                if(visited[i]){
                    System.out.print(dist[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        else{
            visited[index] = !visited[index];
            dfs(dist, visited, index+1);
            visited[index] = !visited[index];
            dfs(dist, visited, index+1);
        }
    }
}