package level3;
import java.util.LinkedList;
import java.util.Queue;

public class Track {
    static int[] pointX = {1,0,-1,0};
    static int[] pointY = {0,-1,0,1};
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};

        System.out.println(solution(board));
    }

    public static int solution(int[][] board){
        int answer = Integer.MAX_VALUE;
        int row = board.length, col = board[0].length;
        Queue<Car> q = new LinkedList<>();

        q.add(new Car(0,0,-1,0));
        board[0][0] = 1;

        while(!q.isEmpty()){
            Car car = q.poll();

            if(car.x==row-1&&car.y==col-1){
                answer = Math.min(answer,car.cost);
                continue;
            }

            for(int i=0; i<pointX.length; i++){
                int newX = pointX[i]+car.x;
                int newY = pointY[i]+car.y;

                if(newX>=0 && newY>=0 && newX<row && newY<col && board[newX][newY]!=1){
                    int temp = 0;

                    if(car.dir==-1 || car.dir == i){
                        temp += car.cost + 100;
                    }
                    else if(car.dir!=i){
                        temp += car.cost + 600;
                    }

                    if(board[newX][newY]==0){
                        board[newX][newY] = temp;
                        q.add(new Car(newX,newY, i, temp));
                    }
                    else if(board[newX][newY]>=temp){
                        board[newX][newY] = temp;
                        q.add(new Car(newX,newY, i, temp));
                    }
                }
            }
        }

        print(board);
        return answer;
    }

    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }

    static class Car{
        int x,y,dir,cost;

        Car(int x, int y, int dir, int cost){
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
    }
}

//3800