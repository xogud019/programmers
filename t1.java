import java.util.*;

public class t1 {
    public String solution(int n, int[][] delivery) {
        String answer = "";
        String[] arr = new String[n+1];
        
        Map<Integer, String> map = new HashMap<>();
        Arrays.sort(delivery, new Comparator<int[]>(){
           @Override
            public int compare(int[] ar1, int[] ar2){
                return ar2[2] - ar1[2];
            }
        });
        for(int i=0; i<delivery.length; i++){
            int pro1 = delivery[i][0];
            int pro2 = delivery[i][1];
            
            if(delivery[i][2] == 1){
                map.put(pro1,"O");
                map.put(pro2,"O");
            }
            else{
                if(map.containsKey(pro1)&&map.get(pro1).equals("O")) map.put(pro2,"X");
                else if(map.containsKey(pro2)&&map.get(pro2).equals("O")) map.put(pro1,"X");
                else{
                    if(!map.containsKey(pro1)) map.put(pro1,"?");
                    if(!map.containsKey(pro2)) map.put(pro2,"?");
                }
            }
        }
        
        for(int i:map.keySet()){
            arr[i] = map.get(i);
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] != null){
                answer += arr[i];
            }
            else answer += "?";
        }
        return answer;
    }
}
