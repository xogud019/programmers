package level3;
import java.util.*;
//not
public class BestAlbum {
    public static void main(String[] args){
        String[] genres = {"classic","pop","classic","classic","pop"};
        int[] plays={500,600,150,800,2500};
        int[] result = solution(genres, plays);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(String[] genres, int[] plays){
        int[] answer ={};
        Comparator<String> comparator = (val1,val2)->val2.compareTo(val1);
        Map<String, String> tolPlay = new TreeMap<>(comparator);
        Map<Integer, String> gMap = new HashMap<>();
        Map<Integer, Integer> pMap = new HashMap<>();
        Set<String> gen = new HashSet<>();

        for(int i=0; i<plays.length; i++){
            if(tolPlay.containsKey(genres[i])){
                tolPlay.put(genres[i], Integer.toString(Integer.parseInt(tolPlay.get(genres[i]))+plays[i]));
            }
            else{
                tolPlay.put(genres[i], Integer.toString(plays[i]));
            }
            gMap.put(i+1, genres[i]);
            pMap.put(i+1, plays[i]);
            gen.add(genres[i]);
        }
        
        List<String> genList = new ArrayList<>(tolPlay.keySet());

        for(String k:genList){
            System.out.println(k);
        }
        /*
        for(String k:tolPlay.keySet()){
            System.out.println(k+","+tolPlay.get(k));
        }
        for(String k:gen){
            System.out.println(k);
        }
        for(Integer k:gMap.keySet()){
            System.out.println(k+","+gMap.get(k));
        }
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