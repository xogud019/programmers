package level2;

public class TriangleSlug {
    public static void main(String[] args){
        int[] answer = solution(5);
        /*
        for(int i:answer){
            System.out.print(i+" ");
        }
        */
    }

    public static int[] solution(int n) {
        int[] answer;
        int[][] arr = new int[n][n];
        int x = -1, y = 0, val = 1;
        int len = 0;
        int idx = 0;
        
        for(int i=1; i<=n; i++){
            len+=i;
        }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i%3==0) x++;
                else if(i%3==1) y++;
                else if(i%3==2){
                    x--;
                    y--;
                }
                
                arr[x][y] = val++;
            }
        }

        for(int[] i : arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        answer = new int[len];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]>=1) answer[idx++] = arr[i][j];
            }
        }
        
        return answer;
    }
}
