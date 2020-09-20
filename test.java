import java.util.Queue;
import java.util.LinkedList;

public class test {
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
        Queue<Node> q= new LinkedList<>();

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
                    q.add(new Node(newX,newY,cnt.val*grid[newX][newY]%module));
                }
            }
                
        }
        
        return answer <0? -1: answer;
    }
    public static void main(String[] args){

    }
}
