package level3;

import java.util.LinkedList;
import java.util.Queue;

public class Track {
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board){
        int answer = 0;
        Queue<Car> q = new LinkedList<>();
        int row = board.length;
        int col = board[row].length;

        q.add(new Car(0, 0, 0, 0));
        while(!q.isEmpty()){
            Car car = q.poll();

            if(car.x==row-1&&car.y==col-1){
                break;
            }

            board[car.x][car.y]=1;

            if(car.x>0&&board[car.x-1][car.y]==0){
                
            }
        }
        
        //print(board);
        return answer;
    }

    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }

    static class Car{
        int dir,x,y,cost;

        Car(int dir, int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
        
    }
}

//3800