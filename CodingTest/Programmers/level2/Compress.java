package Programmers.level2;

import java.util.*;
//LZW
public class Compress {
    public static void main(String[] args){
        String msg = "KAKAO";
        int[] result = solution(msg);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(String msg) {
        int[] answer = {};
        int dicIdx =27;
        int index = 1;
        Map <String, Integer> dic = new HashMap<>();
        List<Integer> idx = new ArrayList<>();

        for(int i=0; i<26; i++){
            dic.put(Character.toString((char)('A'+i)), i+1);
        }
        
        String start = Character.toString(msg.charAt(0));

        while(index<=msg.length()){
            if(index==msg.length()){
                idx.add(dic.get(start));
                break;
            }

            String next = Character.toString(msg.charAt(index));

            if(dic.containsKey(start+next)){
                start+=next;
                index++;
                continue;
            }
            else{
                dic.put(start+next, dicIdx);
                idx.add(dic.get(start));
                start=next;
            }

            index++;
            dicIdx++;
        }

        answer =new int[idx.size()];
        for(int i=0; i<idx.size(); i++){
            answer[i]=idx.get(i);
        }
        return answer;
    }
}