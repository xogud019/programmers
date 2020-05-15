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
        List<Integer> list = new ArrayList<>();
        int[] result ={};
        int[][] studentAnswer={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] temp = new int[3];
        int count = 0, index = 0, correct = 0, max = 0;

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

        max =temp[0];

        for(int i=0; i<temp.length; i++){
            if(temp[i]>max){
                max = temp[i];
            }
        }

        for(int i=0; i<temp.length; i++){
            if(temp[i]==max){
                list.add(i+1);
            }
        }
        
       result = new int[list.size()];
       for(int i=0; i<list.size(); i++){
           result[i]=list.get(i);
       }
        
        return result;
    }
}