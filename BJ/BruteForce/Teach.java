package BJ.BruteForce;

import java.util.Scanner;

public class Teach {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());

        String[] arr = new String[n];

        if(k<6){
            System.out.println(0);
            scan.close();
            return;
        }

        for(int i=0; i<n; ++i){
            arr[i] = scan.nextLine();
        }
        
        scan.close();

        boolean[] visited = new boolean[26];

        visited['a'-'a'] = true;
        visited['n'-'a'] = true;
        visited['t'-'a'] = true;
        visited['i'-'a'] = true;
        visited['c'-'a'] = true;
    
        k -= 5;
    }
}
