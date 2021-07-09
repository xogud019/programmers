package CodingTest.Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class QueensAttack2 {
    static int[] posX = {0,0,-1,1,1,-1,1,-1};
    static int[] posY = {1,-1,0,0,1,1,-1,-1};
    static class Queen{
        int x;
        int y;
        
        Queen(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        Queen q = new Queen(r_q, c_q);
        Map<String, String> map = new HashMap<>();

        int answer = 0;

        for(int i=0; i<obstacles.length; i++){
            map.put(obstacles[i][0]+"-"+obstacles[i][1],"obs");
        }

        for(int i=0; i<posX.length; i++){
            int newX = q.x;
            int newY = q.y;

            while(true){
                newX+=posX[i];
                newY+=posY[i];

                if(newX<=0||newX>n||newY<=0||newY>n){
                    break;
                }
                
                String s = newX+"-"+newY;
                if(map.containsKey(s)){
                    break;
                }

                answer++;
            }
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}