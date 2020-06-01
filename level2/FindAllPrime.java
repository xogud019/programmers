package level2;
import java.util.*;

public class FindAllPrime {
    public static void main(String[] args){
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    public static int solution(String numbers){
        int answer= 0;
        String[] arr = numbers.split("");
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }

        Arrays.sort(list,Collections.reverseOrder());
        boolean[] check = new boolean[arr.length];
        for(int i=0; i<check.length; i++){
            check[i]=false;
        }

        return answer;
    }

    public static void findPrime(String[] arr, boolean[] check){

    }
}