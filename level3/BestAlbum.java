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
        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<genres.length; i++){
            map.put(Integer.toString(i), genres[i]+","+plays[i]);
        }

        List<String> keySetList = new ArrayList<>(map.keySet());
        // 내림차순 //
        Collections.sort(keySetList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = map.get(o1).split(",");
                String[] s2 = map.get(o2).split(",");
                String v1 = s1[0];
                String v2 = s2[0];
                int a = Integer.parseInt(s1[1]);
                int b = Integer.parseInt(s2[1]);
                if(v1.equals(v2)){
                    return a-b;
                }
                else{
                    return v1.compareTo(v2);
                }
            }
        });
        
        for(String i:map.keySet()){
            System.out.println(i+","+map.get(i));
        }
        
        //print(music);
        
        
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