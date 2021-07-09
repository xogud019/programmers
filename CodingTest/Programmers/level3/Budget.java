package CodingTest.Programmers.level3;

import java.util.*;

public class Budget {
    public static void main(String[] args){
        int[] budgets = {120,110,140,150};
        int M = 485;
        System.out.println(solution(budgets, M));
    }
    
    public static int solution(int[] budgets, int M){
        long total = 0;
        int min = 0;
        int max = 0;
        int mid = 0;
        int temp = 0;
        Arrays.sort(budgets);

        for(int i=0; i<budgets.length; ++i){
            total += budgets[i];
        }

        if(total<=M){
            return budgets[budgets.length-1];
        }

        max = M;
        while(true){
            mid = (min+max)/2;
            
            if(mid==temp){
                return mid;
            }
            for(int i=0; i<budgets.length; i++){
                if(mid>=budgets[i]){
                    total+=budgets[i];
                }
                else{
                    total+=mid*(budgets.length-i);
                    break;
                }
            }

            if(total>M){
                max = mid;

            }
            else{
                min = mid;
            }
            temp = mid;
            total=0;
        }
    }
}