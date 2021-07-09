package CodingTest.Programmers.level3;

import java.util.*;

public class GemShopping {
    public static void main(String[] args){
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        //String[] gems = {"AA", "AB", "AC", "AA", "AC"};

        int[] result = solution(gems);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(String[] gems) {
        int[] answer = new int[2];
        Set<String> gemList = new HashSet<>();
        Map<String, Integer> gem = new HashMap<>();
        Queue<String> q = new LinkedList<>();

        int start = 0;
        int startP = 0;
        int max = Integer.MAX_VALUE;

        for(int i=0; i<gems.length; i++){
            gemList.add(gems[i]);
        }

        for(int i=0; i<gems.length; i++){
            if(!gem.containsKey(gems[i])){
                gem.put(gems[i], 1);
            }
            else{
                gem.put(gems[i], gem.get(gems[i])+1);
            }

            q.add(gems[i]);

            while(true){
                String temp = q.peek();
                if(gem.get(temp)>1){
                    gem.put(temp, gem.get(temp)-1);
                    startP++;
                    q.poll();
                }
                else break;
            }

            if(gem.size()==gemList.size()&&max>q.size()){
                max = q.size();
                start = startP;
            }
        }

        answer[0] = start+1;
        answer[1] = start+max;

        return answer;
    }
}