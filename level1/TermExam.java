package level1;
import java.util.*;

public class TermExam {
    public static void main(String[] args){
        //int[] answer ={1,2,3,4,5};
        int[] answer ={1,3,2,4,2};

        int[] result = solution(answer);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }    

    public static int[] solution(int[] answer){
        int[] result ={};
        int[][] studentAnswer={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] temp = new int[3];
        int count=0;
        int index=0;
        int correct=0;

        while(index!=3){
            for(int i=0; i<answer.length; i++){
                if(count==studentAnswer[index].length){
                    count=0;
                }
                if(answer[i]==studentAnswer[index][count]){
                    correct++;
                    count++;
                }
                else{
                    count++;
                }
            }
            count=0;
            temp[index]=correct;
            correct=0;
            index++;
        }
        
        
       
        
        return result;
    }
}