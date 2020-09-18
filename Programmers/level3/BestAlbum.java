package Programmers.level3;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args){
        String[] genres = {"classic","pop","classic","pop","classic"};
        int[] plays={500,600,800,2500,500};
        int[] result = solution(genres, plays);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(String[] genres, int[] plays){
        Map<String, Integer> tolPlay = new HashMap<>();
        Map<Integer, String> gMap = new HashMap<>();
        Map<Integer, Integer> pMap = new HashMap<>();
        Comparator<Integer> comparator = (s1, s2)->s2.compareTo(s1);
        Map<Integer, String> sortMap = new TreeMap<>(comparator);

        for(int i=0; i<plays.length; i++){
            if(tolPlay.containsKey(genres[i])){
                tolPlay.put(genres[i], tolPlay.get(genres[i])+plays[i]);
            }
            else{
                tolPlay.put(genres[i],plays[i] );
            }
            gMap.put(i+1, genres[i]);
            pMap.put(i+1, plays[i]);
        }

        for(String k:tolPlay.keySet()){
            sortMap.put(tolPlay.get(k), k);
        }

        List<String> genList = new ArrayList<>(sortMap.values());
        List<Integer> temp;
        List<Integer> index = new ArrayList<>();

        for(String k:genList){
            temp = new ArrayList<>();
            for(int i:gMap.keySet()){
                if(k.equals(gMap.get(i))){
                    temp.add(pMap.get(i));
                }
            }
            
            if(temp.size()!=1){
                Collections.sort(temp, Collections.reverseOrder());
                
                for(int i=0; i<2; i++){
                    for(int j:pMap.keySet()){
                        if(temp.get(i)==pMap.get(j)){
                            index.add(j-1);
                            pMap.put(j, 0);
                            
                        }
                    }
                }
            }
            else{
                for(int j:pMap.keySet()){
                    if(temp.get(0)==pMap.get(j)){
                        index.add(j-1);
                        pMap.put(j, 0);
                        break;
                    }
                }

            }
        }

        int[] answer = new int[index.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=index.get(i);
        }
        
        /*
        for(String k:genList){
            System.out.println(k);
        }
        */
        /*
        for(int k:gIndex){
            System.out.println(k);
        }
        for(int k:pIndex){
            System.out.println(k);
        }
        */
        /*
        for(int i:sortMap.keySet()){
            System.out.println(i+","+sortMap.get(i));
        }
        */
        /*
        for(String k:tolPlay.keySet()){
            System.out.println(k+","+tolPlay.get(k));
        }
        */
        /*
        for(Integer k:gMap.keySet()){
            System.out.println(k+","+gMap.get(k));
        }
        */
        /*
        System.out.println();
        for(Integer k:pMap.keySet()){
            System.out.println(k+","+pMap.get(k));
        }
        */
        return answer;
    }

    

    public static void print(String[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}