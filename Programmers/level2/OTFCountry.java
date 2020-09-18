package Programmers.level2;


public class OTFCountry {
    public static void main(String[] args){
        int n=15;
        System.out.println(solution(n));
    }

    public static String solution(int n){
        String answer ="";
        int rest = 0;
        int share = n;
        while(share!=0){
            rest = share%3;
            share = share/3;
            if(rest==0){
                answer="4"+answer;
                share--;
            }
            else{
                answer= Integer.toString(rest)+answer;
            }
        }
        return answer;
    }
}