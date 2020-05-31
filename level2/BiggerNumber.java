package level2;
import java.util.*;

public class BiggerNumber {
    public static void main(String[] args){
        int[] numbers ={3,30,34,5,9};
        System.out.println(solution(numbers));
    }
    /*
    내림차순 : return (o2+o1).compareTo(o1+o2);

    오름차순 : return (o1+o2).compareTo(o1+o2);
    */
    public static String solution(int[] numbers){
        String answer = "";
        String[] number = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            number[i]= Integer.toString(numbers[i]);
        }

        Arrays.sort(number, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(number[0].startsWith("0")){
            answer+="0";
        }
        else{
            for(int i=0; i<number.length; i++){
                answer+=number[i];
            }
        }
        return answer;
    }

}