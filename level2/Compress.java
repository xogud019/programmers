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
        int index = 27;
        Map <Character, Integer> dic = new HashMap<>();
        List<Integer> temp = new ArrayList<>();

        //Make Dictionary
        for(int i=0; i<26; i++){
            dic.put((char)('A'+i), i+1);
        }

        for(int i=0; i<msg.length(); i++){
            char s = msg.charAt(i);
            if(dic.containsKey(s)){
                temp.add(dic.get(s));
                
            }
        }
        return answer;
    }
}