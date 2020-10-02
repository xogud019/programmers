package Codility;

import java.util.*;

public class Fish {
    static class Fishs{
        int dir = 0;
        int val = 0;
        
        Fishs(int val, int dir){
            this.val = val;
            this.dir = dir;
        }
    }
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Fishs> stk = new Stack<>();
        Fishs fish;
        int upSize = 0;
        
        for(int i=0; i<A.length; i++){
            fish = new Fishs(A[i],B[i]);
            
            if(fish.dir == 1){
                stk.push(fish);
            }
            else{
                while(!stk.isEmpty()){
                    if(fish.val<stk.peek().val) break;
                    else stk.pop();
                }
                
                if(stk.isEmpty()) upSize++;
            }
        }
        
        return stk.size()+upSize;
    }
}
