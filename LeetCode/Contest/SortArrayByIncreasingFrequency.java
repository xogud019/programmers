package LeetCode.Contest;

import java.util.*;
//5539 re 
public class SortArrayByIncreasingFrequency{
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = {};
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        List<Integer> list1 = new ArrayList<>();
        
        Collections.sort(list, new Comparator<Integer>(){
           @Override
            public int compare(Integer o1, Integer o2){
                if(map.get(o1) == map.get(o2)) return o2-o1;
                else return map.get(o1)- map.get(o2);
            }
        });
        
        answer  = new int[nums.length];
        
        for(int i:list){
            while(map.get(i)>0){
                list1.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        
        for(int i=0; i<list1.size(); i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}
