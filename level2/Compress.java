package level2;
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
        int index = 1;
        int dicIdx =27;
        Map <String, Integer> dic = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();

        for(int i=0; i<26; i++){
            dic.put(Character.toString((char)('A'+i)), i+1);
        }
        /*
        for(String c: dic.keySet()){
            System.out.println(c+","+dic.get(c));
        }
        */
        String start = Character.toString(msg.charAt(0));
        while(index<msg.length()){
            String next = Character.toString(msg.charAt(index));
            if(dic.containsKey(start+next)){
                start+=next;
                index++;
            }
            else{
                idx.add(dic.get(start));
            }
            System.out.println(start+","+next+","+start+next);
            dic.put(start+next, dicIdx);
            start = next;
            dicIdx++;
            index++;
        }

        for(int i=0; i<idx.size(); i++){
            System.out.println(idx.get(i));
        }
        return answer;
    }
}