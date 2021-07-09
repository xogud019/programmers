package Programmers.level3;


public class Network {
    public static void main(String[] args){
        int n  =3;
        int[][] computers={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n, computers));
    }   

    public static int solution(int n, int[][] computers){
        int answer = 0;
        boolean[][] visited= new boolean[n][n];
        for(int i=0; i<computers.length; i++){
            if(!visited[i][i]){
                dfs(visited, computers, i, n);
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(boolean[][] visited,int[][] computers, int index, int max){
        for(int i=0; i<max; i++){
            if(!visited[i][index]&&computers[i][index]==1){
                visited[i][index]=visited[index][i]=true;
                dfs(visited, computers, i, max);
            }
        }
    }
}