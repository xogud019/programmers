package BJ.BruteForce;

import java.util.Scanner;

public class CandyGame {
    static int answer = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] arr = new String[n];
        char[][] candy = new char[n][];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextLine();
            candy[i] = arr[i].toCharArray();
        }

        scan.close();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                swap(candy, i,j, i, j+1);
                check(candy, n);
                swap(candy, i,j, i, j+1);

                swap(candy, j, i, j+1, i);
                check(candy, n);
                swap(candy, j, i, j+1, i);
            }
        }

        System.out.println(answer);
    }

    public static void swap(char[][] candy, int i, int j, int k, int l){
        char tmp = candy[i][j];
        candy[i][j] = candy[k][l];
        candy[k][l] = tmp;
    }

    public static void check(char[][] candy, int n){
        for(int i=0; i<n; i++){
            int count = 1;

            for(int j=1; j<n; j++){
                if(candy[i][j]==candy[i][j-1]) count++;
                else{
                    answer = Math.max(count, answer);
                    count = 1;
                }
            }

            answer = Math.max(count, answer);
        }

        for(int i=0; i<n; i++){
            int count = 1;

            for(int j=1; j<n; j++){
                if(candy[j][i]==candy[j-1][i]) count++;
                else{
                    answer = Math.max(count, answer);
                    count = 1;
                }
            }

            answer = Math.max(count, answer);
        }
    }

    public static void print(char[][] candy){
        for(char[] i:candy){
            for(char j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
