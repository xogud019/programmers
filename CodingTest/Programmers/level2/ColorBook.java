package CodingTest.Programmers.level2;

import java.util.*;

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
        Stack<Integer> XStack = new Stack<>();
        Stack<Integer> YStack = new Stack<>();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count = 0;
                if(picture[i][j]!=0&&!visited[i][j]){
                    XStack.push(j);
                    YStack.push(i);
                    visited[i][j]= true;
                    count++;
                    answer[0]++;
                }

                while(!XStack.isEmpty()){
                    int x = XStack.pop();
                    int y = YStack.pop();

                    if(y>0&&picture[y-1][x]==picture[i][j]&&!visited[y-1][x]){
                        XStack.push(x);
                        YStack.push(y-1);
                        visited[y-1][x]=true;
                        count++;
                    }
                    
                    if(y<m-1&&picture[y+1][x]==picture[i][j]&&!visited[y+1][x]){
                        XStack.push(x);
                        YStack.push(y+1);
                        visited[y+1][x]=true;
                        count++;

                    }
                    
                    if(x>0&&picture[y][x-1]==picture[i][j]&&!visited[y][x-1]){
                        XStack.push(x-1);
                        YStack.push(y);
                        visited[y][x-1]=true;
                        count++;

                    }
                    if(x<n-1&&picture[y][x+1]==picture[i][j]&&!visited[y][x+1]){
                        XStack.push(x+1);
                        YStack.push(y);
                        visited[y][x+1]=true;
                        count++;

                    }
                }
                if(answer[1]<count){
                    answer[1]=count;
                }
            }
        }
        
        return answer;
    }
}