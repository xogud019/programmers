package BJ.DivAndCon;
//try again
public class PrintStar {
    static char[][] arr = new char[2187][2187];
    public static void main(String[] args){
        
        did(0,0,27);

        for(int i=0; i<27; i++){
            for(int j=0; j<27; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void did(int x, int y, int n){
        if(n==1){
            arr[x][y] = '*';
            return;
        }

        int num = n/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i!=1||j!=1) did(x+i*num,y+j*num,num);
            }
        }
    }
}
