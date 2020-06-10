package level3;
import java.util.*;

public class Budget {
    public static void main(String[] args){
        int[] budgets = {120,110,140,150};
        int M = 485;
        System.out.println(solution(budgets, M));
    }
    
    public static int solution(int[] budgets, int M){
        int answer = 0;
        Arrays.sort(budgets);
        int min = budgets[0];
        int max = M;
        int mid = 0;
        int temp = 0;
        long total = 0;

        for(int i=0; i<budgets.length; ++i){
            total+=budgets[i];
        }

        if(total<=M){
            return budgets[budgets.length-1];
        }
        else{
            while(true){
                total = 0;
                mid = (max+min)/2;
                if(mid == temp){
                    break;
                }

                for(int i=0; i<budgets.length; ++i){
                    if(mid<=budgets[i]){
                        total+= mid*(budgets.length-i);
                        break;
                    }
                    else{
                        total+=budgets[i];
                    }

                }
                if(total<=M){
                    min = mid;
                }
                else{
                    max = mid;
                }
                temp = mid;
            }
            answer = mid;
        }
        return answer;
    }
}