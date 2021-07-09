package CodingTest.BJ.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] dwarf = new int[9];
        int sum = 0;
        boolean isT = false;

        for(int i=0; i<9; i++){
            dwarf[i] = scan.nextInt();
            sum += dwarf[i];
        }

        scan.close();

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(sum-(dwarf[i]+dwarf[j])==100){
                    dwarf[i] = -1;
                    dwarf[j] = -1;
                    isT = true;
                    break;
                }   
            }
            if(isT) break;
        }

        Arrays.sort(dwarf);

        for(int i:dwarf){
            if(i!=-1) System.out.println(i);
        }
    }
}
