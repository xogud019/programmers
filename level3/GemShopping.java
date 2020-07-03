package level3;
import java.util.*;

public class GemShopping {
    public static void main(String[] args){
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};

        int[] result = solution(gems);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(String[] gems) {
        int[] answer = {};
        Set<String> gemList =new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        int start = 0;
        int startP = 0;
        int len = Integer.MAX_VALUE;

        for(String k : gems){
            gemList.add(k);
        }

        for(int i=0; i<gems.length; i++){
            if(!map.containsKey(gems[i])){
                map.put(gems[i], 1);
            }          
            else{
                map.put(gems[i], map.get(gems[i])+1);
            }

            q.add(gems[i]);

            while(true){
                String temp = q.peek();
                if(map.get(temp)>1){
                    map.put(temp, map.get(temp)-1);
                    q.poll();
                    startP++;
                }
                else{
                    break;
                }
            }

            if(map.size() == gemList.size()&&len>q.size()){
                len = q.size();
                start = startP;
            }
        }

        for(String k : map.keySet()){
            System.out.println(k+","+map.get(k));
        }

        System.out.println(startP+"+"+len);

        

        return answer;
    }
}