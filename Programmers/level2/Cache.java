package Programmers.level2;

import java.util.*;

public class Cache {
    public static void main(String[] args){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize, cities));
    }   
    
    public static int solution(int cacheSize, String[] cities){
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for(int i=0; i<cities.length; ++i){
            cities[i]= cities[i].toLowerCase();
            if(q.size()<cacheSize){
                if(q.contains(cities[i])){
                    q.remove(cities[i]);
                    q.add(cities[i]);
                    answer++;
                }
                else{
                    q.add(cities[i]);
                    answer+=5;
                }
            }
            else{
                if(q.contains(cities[i])){
                    q.remove(cities[i]);
                    q.add(cities[i]);
                    answer++;
                }
                else{
                    q.poll();
                    q.add(cities[i]);
                    answer+=5;
                }
            }
        }        
    
        return answer;
    }
    /*90
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for(int i=0; i<cities.length; i++){
                        cities[i] = cities[i].toLowerCase();

            if(map.size()<cacheSize){
                if(!map.containsKey(cities[i])){
                    map.put(cities[i], cacheSize);
                    answer +=5;
                }
                else{
                    map.put(cities[i],cacheSize);
                    answer++;
                }
            }
            else{
                if(!map.containsKey(cities[i])){
                    int min = cacheSize+1;
                    String temp = "";
                    for(String k: map.keySet()){
                        if(map.get(k)<min){
                            min = map.get(k);
                            temp = k;
                        }
                    }
                    map.remove(temp);
                    map.put(cities[i], cacheSize);
                    answer +=5;
                }
                else{
                    map.put(cities[i],cacheSize);
                    answer++;
                }
            }

            for(String k : map.keySet()){
                map.put(k, map.get(k)-1);
            }
        }
        //print(map);
        return answer;
    }
    */
}

