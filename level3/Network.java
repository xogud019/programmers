package level3;

public class Network {
    public static void main(String[] args){
        int n  =3;
        int[][] computers={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n, computers));
    }   

    public static int solution(int n, int[][] computers){
        int answer = 0;
        boolean[][] visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            if(!visited[i][i]){
                dfs(i, n ,computers, visited);
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(int index, int n, int[][] computers,boolean[][] visited){
        for(int i=0; i<n; i++){
            if(computers[index][i]==1&&!visited[index][i]){
                visited[index][i] = visited[i][index] = true;
                dfs(i,n,computers, visited);
            }
        }
    }

}