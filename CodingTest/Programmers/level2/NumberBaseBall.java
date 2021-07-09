package CodingTest.Programmers.level2;

import java.util.*;

public class NumberBaseBall {
    public static void main(String[] args){
        int[][] baseball ={{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
        System.out.println(solution(baseball));
    }

    public static int solution(int[][] baseball){
        int answer = 0;
        List<String> number = new ArrayList<>(); 
        List<Integer> stk = new ArrayList<>(); 
        List<Integer> ball = new ArrayList<>(); 

        for(int i=0; i<baseball.length; i++){
            number.add(String.valueOf(baseball[i][0]));
            stk.add(baseball[i][1]);
            ball.add(baseball[i][2]);
            //System.out.println(number.get(i)+","+stk.get(i)+","+ball.get(i));
        }
        /*
        for(int j=0; j<baseball.length; j++){
            int stkC = stkCount(124, number.get(j));
            int ballC = ballCount(124, number.get(j));
            System.out.println(stkC+","+ballC);
        }
        */
        

        //System.out.println(stkCount(123,number.get(0)));
        //System.out.println(ballCount(123,number.get(0)));
        for(int i=123; i<=999; i++){
            boolean isC = false;
            
            if((i/100)%10==(i/10)%10||(i/100)%10==i%10||(i/10)%10==i%10){
                continue;
            }
            else if(String.valueOf(i).contains("0")){
                continue;
            }
            
            for(int j=0; j<baseball.length; j++){
                int stkC = stkCount(i, number.get(j));
                int ballC = ballCount(i, number.get(j));

                if(stkC==stk.get(j)&&ballC==ball.get(j)){
                    isC = false;
                }
                else{
                    isC= true;
                    break;
                }

            }
            if(!isC){
                answer++;
            }
            //System.out.println(i);
        }
        return answer;
    }

    public static int stkCount(int n, String s){
        int answer =0;
        String temp = String.valueOf(n);

        for(int i=0; i<s.length(); i++){
            if(temp.charAt(i)==s.charAt(i)){
                answer++;
            }
        }
        
        return answer;
    }

    public static int ballCount(int n, String s){
        int answer =0;
        String temp = String.valueOf(n);

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(temp.charAt(i)==s.charAt(j)&&i!=j){
                    answer++;
                }
            }
        }

        return answer;
    }
}
