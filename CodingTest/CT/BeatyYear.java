package CodingTest.CT;

import java.util.*;
public class BeatyYear {
    public static void main(String[] args){
        int year = 1987;
        System.out.println(solution(year));

    } 

    public static int solution(int p){
        int index = 1;
        List<Character>list = new ArrayList<>();       
        while(true){
            list.clear();
            String year = Integer.toString(p+index);
            for(int i=0; i<year.length(); i++){
                if(!list.contains(year.charAt(i))){
                    list.add(year.charAt(i));
                }

            }
            if(list.size()==year.length()){
                return Integer.parseInt(year);
            }
            else{
                index++;
            }
        } 
    }
}