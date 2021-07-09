package CodingTest.Programmers.level1;

import java.util.*;

public class NonCompletor {
    public static void main(String[] args){
        String[] participant = {"kiki ", "kiki", "asd"};
        String[] completion ={"kiki", "kiki"};
        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion){
        String answer= "";
        String[] tempP = participant;
        String[] tempC = completion;
        Arrays.sort(tempP);
        Arrays.sort(tempC);

        for(int i=0; i<tempC.length; i++){
            if(tempC[i].equals(tempP[i])){
                if(i+1==tempC.length){
                    answer= tempP[i+1];
                }
            }
            else{
                answer= tempP[i];
                break;
            }
        }

        return answer;
    }

    public static void print(String[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}