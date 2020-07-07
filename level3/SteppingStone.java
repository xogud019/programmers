package level3;
import java.util.*;
//not
public class SteppingStone {
    public static void main(String[] args){
        int[] stones = {2,4,5,3,2,1,4,2,5,1};
        int k = 3;
    }

    public static int solution(int[] stones, int k){
        Arrays.sort(stones);

        int min = stones[0];
        int max = stones[stones.length-1];
        int mid = (min+max)/2;

        
    }
}