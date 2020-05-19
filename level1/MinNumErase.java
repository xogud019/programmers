package level1;
import java.util.*;

public class MinNumErase {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        int[] result = solution(arr);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int min = arr[0];
        if(arr.length ==1){
            answer= new int[1];
            answer[0]=-1;
            return answer;
        }
        else{
            for(int i=1; i<arr.length; i++){
                if(min>arr[i]){
                    min=arr[i];
                }
            }

            for(int i=0; i<arr.length; i++){
                if(arr[i]!=min){
                    list.add(arr[i]);
                }
            }
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i]= list.get(i);
            }
            return answer;
        }
    }
}