package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> answer = new ArrayList<>();
        int len = A.length;
        int[][] arr = new int[len][26];
        
        for(int i=0; i<len; i++){
            for(int j=0; j<A[i].length(); j++){
                arr[i][A[i].charAt(j)-'a']++;
            }
        }
        
        for(int j=0; j<26; j++){
            int base = arr[0][j];
            boolean isT = true;
            
            if(base == 0) continue;
            
            for(int i=1; i<len; i++){
                if(base == arr[i][j]) base = arr[i][j];
                else if(base != arr[i][j] && arr[i][j] != 0) base = Math.min(base,arr[i][j]);
                else{
                    isT = false;
                    break;
                }
            }
            
            if(isT){
                for(int i=0; i<base; i++){
                    String s = ""+(char)('a'+j);
                    answer.add(s);
                }   
            }
        }
        //System.out.println('b'-'a');
        return answer;
    }
}
