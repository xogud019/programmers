package level3;
import java.util.*;

public class BadUser {
    static String list ="";
    static List<String> list1 = new ArrayList<>();
    static Set<String> user = new HashSet<>();

    public static void main(String[] args){
        //String[] user_id= {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] user_id= {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        //String[] banned_id = {"fr*d*", "abc1**"};
        String[] banned_id = {"*rodo", "*rodo", "******"};
        //String[] banned_id = {"fr*d*", "*rodo", "******", "******"};

        System.out.println(solution(user_id, banned_id));
    }

    public static int solution(String[] user_id, String[] banned_id){
        boolean[] visited = new boolean[user_id.length];
        boolean[] bVisited = new boolean[banned_id.length];

        for(int i=0; i<banned_id.length; i++){
            banned_id[i] = banned_id[i].replaceAll("[*]", ".");
        }

        dfs(user_id, banned_id, visited, bVisited, 0, banned_id.length);

        return user.size();
    }

    public static void dfs(String[] user_id, String[] banned_id, boolean[] visited,boolean[] bVisited, int index, int max){
        if(index==max){
            Collections.sort(list1);
            String s ="";
            for(String k:list1){
                s+=k;
            }

            user.add(s);
            return;
        }

        for(int i=index; i<banned_id.length; i++){
            if(bVisited[i]){
                continue;
            }
            for(int j=0; j<user_id.length; j++){
                if(visited[j]){
                    continue;
                }
                if(user_id[j].matches(banned_id[i])){
                    visited[j] = !visited[j];
                    bVisited[i] = !bVisited[i];
                    list1.add(user_id[j]);
                    dfs(user_id, banned_id, visited, bVisited, index+1, max);
                    visited[j] = !visited[j];
                    bVisited[i] = !bVisited[i];
                    list1.remove(user_id[j]);
                }
            }
        }
    }
    /*failed case timeout 
    public static int solution(String[] user_id, String[] banned_id){
        boolean[] visited = new boolean[user_id.length];
        boolean[] bVisited = new boolean[banned_id.length];

        for(int i=0; i<banned_id.length; i++){
            banned_id[i] = banned_id[i].replaceAll("[*]", ".");
        }

        dfs(user_id, banned_id, visited, bVisited, 0, banned_id.length);

        return user.size();
    }

    public static void dfs(String[] user_id, String[] banned_id, boolean[] visited,boolean[] bVisited, int index, int max){
        if(index==max){
            String[] temp = list.split(",",-1);
            String s ="";

            Arrays.sort(temp);

            for(String k : temp){
                s+=k;
            }

            user.add(s);
            
            return;
        }

        for(int i=index; i<banned_id.length; i++){
            for(int j=0; j<user_id.length; j++){
                if(user_id[j].matches(banned_id[i])&&!visited[j]&&!bVisited[i]){
                    visited[j] = !visited[j];
                    bVisited[i] = !bVisited[i];
                    list +=user_id[j]+",";
                    dfs(user_id, banned_id, visited, bVisited, index+1, max);
                    visited[j] = !visited[j];
                    bVisited[i] = !bVisited[i];
                    list = list.substring(0, list.length()-user_id[j].length()-1);
                }
            }
        }
    }
    */
}