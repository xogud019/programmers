package Programmers.level1;

public class year {
    public static void main(String[] args){
        int a =1,  b= 7;
        System.out.println(solution(a,b));
    }

    public static String solution(int a, int b){
        String answer="";
        String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day=0;
        for(int i=0; i<a-1; i++){
            if(month[i]%7-1!=0){
                day += month[i]%7;
            }else{
                day++;
            }

            if(day>7){
                day = day%7;
            }
        }
        
        answer = weeks[(day+b-1)%7];
        
        return answer;
    }
}