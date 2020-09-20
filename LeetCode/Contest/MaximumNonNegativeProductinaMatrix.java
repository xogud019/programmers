package LeetCode.Contest;
import java.util.*;
//time out
/*
[[1,-1,2,1,-1,0,0,4,3,2,0,-2,-2],[-2,3,3,-1,-1,0,0,-2,4,-3,3,0,0],[-4,-1,-1,-2,2,-1,-2,-2,0,3,-1,-4,1],[-3,4,-3,0,-3,1,-3,1,4,4,-4,-4,-2],[3,-3,1,0,-1,-4,-4,-4,3,2,2,3,3],[2,-1,-1,-4,-3,-3,4,2,3,4,4,-4,0],[4,-1,2,-3,-1,-1,-3,-4,4,4,4,-3,-1],[-3,-4,4,-2,-1,2,3,-1,2,3,4,4,-4],[-3,-1,-2,1,1,-1,-3,-4,-3,1,-3,3,-4],[2,4,4,4,-3,-3,1,-1,3,4,-1,1,4],[2,-2,0,4,-1,0,-2,4,-4,0,0,2,-3],[1,1,-3,0,-4,-4,-4,-4,0,-1,-4,-1,0],[3,-1,-3,-3,-3,-2,-1,4,-1,-2,4,2,3]]
Output:
38431730
Expected:
459630706
*/
public class MaximumNonNegativeProductinaMatrix {
    static int[] dix = {0,1};
    static int[] diy = {1,0};
    static int module = 1000000007;
    class Node{
        int x;
        int y;
        int val;
        
        Node(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
    
    public int maxProductPath(int[][] grid) {
        int answer = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0,grid[0][0]));
        
        
        while(!q.isEmpty()){
            Node cnt = q.poll();
            
            if(cnt.x==grid.length-1&&cnt.y==grid[0].length-1){
                answer = Math.max(answer, cnt.val);
                continue;
            }
            
            for(int i=0; i<dix.length; i++){
                int newX = cnt.x+dix[i];
                int newY = cnt.y+diy[i];
            
            
                if(newX>=0 && newY>=0 && newX<grid.length && newY<grid[0].length){
                    q.add(new Node(newX,newY,cnt.val*(grid[newX][newY]%module)));
                }
            }
                
        }
        
        return answer <0? -1: answer;
    }
}
