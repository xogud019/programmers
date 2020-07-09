package level3;
//not
public class SteppingStone {
    public static void main(String[] args){
        //int[] stones = {2,4,5,3,2,1,4,2,5,1};
        int[] stones = {2};
        int k = 3;
        
        System.out.println(solution(stones, k));
    }

    public static int solution(int[] stones, int k){
        int min = Integer.MAX_VALUE;
        int max = -1;
        
        for(int i : stones){
            if(min>i){
                min = i;
            }

            if(max<i){
                max = i;
            }
        }

        if(stones.length ==1) return (min+max)/2;

        while(min<max){
            int mid = (max+min)/2;
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

        return min-1;
    }
}