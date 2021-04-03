package KKO.KC2021;
import java.util.List;
import java.util.ArrayList;

public class t3 {
    List<Integer> list;
    boolean[] visited;
    int pass;
    int[] answer;
    
    public int[] solution(int n, int[] passenger, int[][] train) {
        answer = new int[2];
        list = new ArrayList<>();
        visited = new boolean[train.length];
        pass = passenger[0];
        list.add(1);
        
        dfs(train, 1, passenger);
        return answer;
    }
    
    public void dfs(int[][] train, int start, int[] passenger){
        for(int i=0; i<train.length; i++){
            if(train[i][0] == start && !visited[i]){
                visited[i] = true;
                pass += passenger[train[i][1]-1];
                list.add(train[i][1]);
                dfs(train, train[i][1], passenger);
                
                if(pass > answer[1]){
                    answer[1] = pass;
                    answer[0] = list.get(list.size()-1);
                }
                else if(pass == answer[1]){
                    if(list.get(list.size()-1) > answer[0]){
                        answer[0] = list.get(list.size()-1);
                    }
                }
                list.remove(list.size()-1);
                pass -= passenger[train[i][1]-1];
            }
        }
        return;
    }
}
