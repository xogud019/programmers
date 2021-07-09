package Note;

public class t3 {
    static int[] answer;
    static int[] X = {-1, 0, 1, 0};
    static int[] Y = {0, 1, 0, -1};
    static boolean[][] visited;
    public int[] solution(int[][] v){
        answer  = new int[3];
        visited = new boolean[v.length][v[0].length];
        
        for(int i=0 ; i<v.length; i++){
            for(int j=0; j<v[0].length; j++){
                if(visited[i][j]) continue;
                
                if(!visited[i][j]){
                    visited[i][j] = true;
                    dfs(v, v[i][j], i,j);
                    answer[v[i][j]]++;
                    //print();
                    //System.out.println();
                }
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int[][] v, int base, int x, int y){
        if(!visited[x][y]) visited[x][y] = true;
        
        for(int i=0; i<4; i++){
            int newX = x+X[i];
            int newY = y+Y[i];
            if(newX>=0 && newY>=0 && newX< v.length && newY< v[0].length && v[newX][newY] == base && !visited[newX][newY]) dfs(v,base,newX, newY);
        }
        //if(!visited[x][y]&& v[x][y] == base) visited[x][y] =true;
            

    }
    /*
    public void print(){
        for(int i=0; i<visited.length; i++){
            for(int j=0; j<visited[0].length; j++){
                System.out.print(visited[i][j]);
            }
            System.out.println();
        }        
    }
    */
}
