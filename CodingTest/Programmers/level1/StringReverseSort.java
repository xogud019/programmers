package Programmers.level1;

import java.util.*;

public class StringReverseSort {
    public static void main(String[] args){
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        String answer ="";
        List<Character> lowerList = new ArrayList<>();
        List<Character> upperList = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))==true){
                upperList.add(s.charAt(i));
            }
            else{
                lowerList.add(s.charAt(i));
            }
        }

        Collections.sort(upperList);
        Collections.sort(lowerList);
        Collections.reverse(upperList);
        Collections.reverse(lowerList);

        for(int i=0; i<lowerList.size(); i++){
            answer+= lowerList.get(i);
        }
        for(int i=0; i<upperList.size(); i++){
            answer+= upperList.get(i);
        }

        return answer;
    }
}