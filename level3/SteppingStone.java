package level3;
import java.util.*;
//not
public class SteppingStone {
    public static void main(String[] args){
        int[] stones = {2,4,5,3,2,1,4,2,5,1};
        int k = 3;
        
        System.out.println(solution(stones, k));
    }

    public static int solution(int[] stones, int k){
        Arrays.sort(stones);

        int min = stones[0];
        int max = stones[stones.length-1];

        while(min<max){
            int mid = min+(max-min)/2;
            int count=0;
            boolean isT = false;

            for(int i=0; i<stones.length; i++){
                if(stones[i]-mid<0){
                    count++;
                }
                else{
                    count=0;
                }

                if(count==k){
                    isT = true;
                }
            }
            if(!isT){
                min = mid+1;
            }
            else{
                max =  mid;
            }

        }

        return min;
    }
}