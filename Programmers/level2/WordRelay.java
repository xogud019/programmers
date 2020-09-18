package Programmers.level2;

import java.util.*;

public class WordRelay {
    public static void main(String[] args){
        //int n = 3;
        int n = 2;
        //String[] word = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] word = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result = solution(n, word);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(int n , String[] words){
        int[] answer = new int[2];
        int round = 1;
        int idx = 0;
        List<String> list = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(list.size()==0){
                list.add(words[i]);
                idx++;
            }
            else{
                if(list.contains(words[i])){
                    //System.out.println(i);
                    answer[0] = idx%n+1;
                    answer[1] = round;
                    return answer;
                }
                else if(list.get(i-1).charAt(list.get(i-1).length()-1)!=words[i].charAt(0)){
                    answer[0] = idx%n+1;
                    answer[1] = round;
                    return answer;
                }
                else{
                    list.add(words[i]);
                    idx++;
                }
            }
            if(idx!=0&&idx%n==0){
                round++;
            }
        }
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        return answer;
    }
}