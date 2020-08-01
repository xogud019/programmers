package Hackers.Medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheGridSearch {
    static String gridSearch(String[] G, String[] P) {
        String answer ="NO";
        String[][] g = new String[G.length][G[0].length()];
        String[][] p = new String[P.length][P[0].length()];
        int gRow = g.length, gCol= g[0].length;
        int pRow = p.length, pCol= p[0].length;
        int max = pRow*pCol;

        for(int i=0; i<gRow; i++){
            for(int j=0; j<gCol; j++){
                g[i][j] =""+ G[i].charAt(j);
            }
        }

        for(int i=0; i<pRow; i++){
            for(int j=0; j<pCol; j++){
                p[i][j] =""+ P[i].charAt(j);
            }
        }
        
        String start = p[0][0];

        for(int i=0; i<gRow-pRow+1; i++){
            boolean isE = false;
            for(int j=0; j<gCol-pCol+1; j++){
                if(g[i][j].equals(start)){
                    int count = 0;
                    for(int k=0; k<pRow; k++){
                        boolean isC = false;
                        for(int l=0; l<pCol; l++){
                            if(p[k][l].equals(g[i+k][j+l])) count++;
                            else{
                                isC = true;
                                break;
                            }
                        }
                        if(isC){
                            break;
                        }
                    }

                    if(count==max){
                        answer = "YES";
                        isE = true;
                        break;
                    }
                }
                if(isE) break;
                //System.out.print(i);
            }
            if(isE) break;
            //System.out.println();
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}