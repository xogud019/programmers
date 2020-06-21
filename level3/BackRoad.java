package level3;
//not
public class BackRoad {
    public static void main(String[] args){
        int m = 4;
        int n = 3;
        int[][] puddles ={{2,2}};

        System.out.println(solution(m, n, puddles));
    }

    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] road = new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(i==1||j==1){
                    road[i][j]=1;
                }
            }
        }

        print(road);
        return answer;
    }

    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}