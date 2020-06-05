package level2;
import java.util.*;

public class Camouflage {
    public static void main(String[] args){
        String[][] clothes ={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
    
    public static int solution(String[][] clothes){
        Map<String,Integer> map = new HashMap<>();
        int answer = 1;
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
            else{
                map.put(clothes[i][1], 1);
            }
        }

        for(String k : map.keySet()){
            answer *= (map.get(k)+1);
        }
        return answer-1;
    }
    /*
    public static int solution(String[][] clothes){
        int[] index  = new int[clothes.length];
        List<String> list = new ArrayList<>();
        int idx = 0;
        int temp = 1;
        for(int i=0; i<clothes.length; i++){
            list.add(clothes[i][1]);
        }

        Collections.sort(list);        

        for(int i=0; i<list.size(); i++){
            index[idx]++;
            if(i!=list.size()-1&&!list.get(i).equals(list.get(i+1))){
                idx++;
            }
        }

        for(int i=0; i<index.length; i++){
            if(index[i]!=0){
                temp *=(index[i]+1);
            }
        }
        return temp-1;
    }
    */
}