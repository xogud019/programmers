package level1;
import java.util.*;

public class NonCompletor {
    public static void main(String[] args){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion ={"eden", "kiki"};
        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion){
        String answer= "";
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<completion.length; i++){
            set.add(completion[i]);
        }

        

        return answer;
    }
}