package level1;
import java.util.*;

public class DividedArray {
    public static void main(String[] args){
        int[] arr = {5,9,7,10};
        int divisor =5;
        int[] result = solution(arr, divisor);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] arr, int divisor){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }

        if(list.size()==0){
            int[] answer = {-1};
            return  answer;
        }
        else{
            Collections.sort(list);
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i]=list.get(i);
            }
            return answer;
        }
    }
}