package level1;

public class RangeNum {
    public static void main(String[] args){
        int x =4;
        int n =3;
        long[] result = solution(x, n);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static long[] solution(int x, int n){
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i]= (long)x*(i+1);
        }

        return answer;
    }
}