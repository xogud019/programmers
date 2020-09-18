package Programmers.level1;

import java.util.Arrays;

public class KNumber {
    public static void main(String[] args){
        int[] array={1,5,2,6,3,7,4};
        int[][] commands ={{2,5,3},{4,4,1},{1,7,3}};
        int[] result = solution(array, commands);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] array, int[][] commands){
        int[] answer =new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] tempArray = new int[(commands[i][1]-commands[i][0])+1];
            int index=0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                tempArray[index]=array[j];
                index++;
            }

            Arrays.sort(tempArray);
            answer[i]=tempArray[commands[i][2]-1];
        }

        return answer;
    }
}