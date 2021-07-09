package CodingTest.Programmers.level2;


public class Carpet {
    public static void main(String[] args){
        int brown = 10;
        int yellow = 2;

        int[] result = solution(brown, yellow);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(int brown, int yellow){
        int[] answer = {};
        int sum = brown+yellow;

        for(int i =1; i<=sum; i++){
            for(int j=1; j<=sum; j++){
                if(sizeCheck(i, j, brown, yellow)==true){
                    answer = new int[2];
                    answer[0]= i;
                    answer[1]= j;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static boolean sizeCheck(int i, int j, int brown, int yellow){
        if((i-2)*2+j*2==brown&&i*j==brown+yellow&&i>=j){
            return true;
        }
        else return false;
    }
}