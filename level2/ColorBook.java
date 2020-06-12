package level2;

public class ColorBook {
    static int MAX = 0;
    public static void main(String[] args){
        int m = 6;
        int n = 4;
        int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,3,3}};
        int[] result = solution(m, n, picture);
        
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(int m, int n, int[][] picture){
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        int total = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int temp = picture[i][j];
                int max =0;
                if(!visited[i][j]){
                    if(picture[i][j]!=0){
                        System.out.println(temp);
                        System.out.println(i+","+j);
                        dfs(picture, visited, max, temp, i,j);
                        total++;
                    }
                }
            }
        }
        for(int i=0; i<visited.length; i++){
            for(int j=0; j<visited[i].length; j++){
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
        
        answer[0] = MAX;
        answer[1] = total;
        return answer;
    }

    public static void dfs(int[][] picture,boolean[][] visited, int max, int temp, int index, int start){
        if(index==picture.length){
            return;
        }
        for(int j=start; j<picture[index].length; j++){
            if(!visited[index][j]&&picture[index][j]==temp){
                max++;
                visited[index][j]=true;
                dfs(picture, visited, max, temp, index+1, start);
            }
        }
        
    }
}