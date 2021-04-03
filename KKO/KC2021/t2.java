package KKO.KC2021;

import java.util.Arrays;

public class t2 {
    public int solution(int[][] needs, int r) {
        int row = needs.length, col = needs[0].length;
        
        if(r == col) return row;
        
        int[][] prio = new int[col][2];
        
        for(int j=0; j<col; j++){
            int temp = 0;
            
            for(int i=0; i<row; i++){
                temp += needs[i][j];    
            }
            
            prio[j][0] = j;
            prio[j][1] = temp;
        }
        
        Arrays.sort(prio, (a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return b[1] - a[1];
        });
        
        int idx = 0;
        
        while(r > 0){
            int erase = prio[idx++][0];
            
            for(int i=0; i<row; i++){
                needs[i][erase] = 0;
            }
            
            r--;
        }
        
        int answer = 0;

        loopA:for(int[]i:needs){
           for(int j:i){
               if(j==1) continue loopA;
           }
            
            answer++;
        }
        
        
        return answer;
    }
}
