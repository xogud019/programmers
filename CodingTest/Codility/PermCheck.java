package CodingTest.Codility;
import java.util.*;

public class PermCheck {
    /*failed case = correct 66 , eeficient 50
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        for(int i:A){
            set.add(i);
            max = Math.max(max,i);
        }
        
        return set.size()==max?1:0;
    }
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        for(int i:A){
            set.add(i);
            max = Math.max(max,i);
        }
        
        return set.size()==max&&set.size()==A.length?1:0;
    }
}
