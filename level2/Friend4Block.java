package level2;

public class Friend4Block {
    public static void main(String[] argS){
        int m = 8;
        int n = 5;
        String[] board = {"HGNHU","CRSHV","UKHVL","MJHQB","GSHOT","MQMJJ","AGJKK","QULKK"};
        System.out.println(solution(m, n, board));
    }

    public static int solution(int m, int n, String[] board){
        int answer = 0;
        char[][] fBoard = new char[m][n];
        boolean[][] square = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                fBoard[i][j] = board[i].charAt(j);
            }
        }

        
        do{
            init(square);
            relocation(fBoard);
            for(int i=0; i<m-1; i++){
                for(int j=0; j<n-1; j++){
                    if(fBoard[i][j]!='x'&&fBoard[i][j]==fBoard[i+1][j]&&fBoard[i][j]==fBoard[i][j+1]&&fBoard[i][j]==fBoard[i+1][j+1]){
                        square[i][j]=true;
                        square[i+1][j]=true;
                        square[i][j+1]=true;
                        square[i+1][j+1]=true;
                   }
                }
            }

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(square[i][j]==true){
                        fBoard[i][j]='x';
                    }
                }
            }
        }while(check(square));
       
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(fBoard[i][j]=='x'){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void relocation(char[][] arr){
        for(int j=0; j<arr[0].length; j++){
            for(int i=arr.length-1; i>=1; i--){
                for(int k=i-1; k>=0; k--){
                    if(arr[i][j]!='x'){
                        break;
                    }
                    else{
                        char temp = arr[i][j];
                        if(arr[k][j]!='x'){
                            arr[i][j] = arr[k][j];
                            arr[k][j] = temp;
                        }
                    }
                }
            }
        }
    }

    public static boolean check(boolean[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void init(boolean[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=false;
            }
        }
    }
    
    public static void print(char[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(boolean[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}