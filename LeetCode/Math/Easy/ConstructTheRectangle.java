package LeetCode.Math.Easy;

public class ConstructTheRectangle {
    /*time out
    public int[] constructRectangle(int area) {
        int[] answer = new int[2];
        int dif = Integer.MAX_VALUE;
        
        for(int i=1; i<=area; i++){
            for(int j=1; j<=area; j++){
                if(j>i) break;
                
                if(i*j != area) continue;
                
                if(dif>Math.abs(j-i)){
                    dif = Math.abs(j-i);
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        
        return answer;
    }
    */
    /*quick
    public int[] constructRectangle(int area) {
        
        
        int width = (int) Math.sqrt(area) ;
        
        while( width > 0 ){
		    if(area % width == 0)  return new int[]{ area/width , width};
         width--;
        }
        
        return new int[]{area , 1};
    }

    */
    public int[] constructRectangle(int area) {
        int[] answer = new int[2];
        int dif = Integer.MAX_VALUE;
        
        for(int i=1; i<=area; i++){
            int j = area/i;
            
            if(j>i) continue;
            if(j*i != area) continue;
            if(dif>Math.abs(i-j)){
                dif = Math.abs(i-j);
                answer[0] = i;
                answer[1] = j;
            }
            
        }
        
        return answer;
    }
}
