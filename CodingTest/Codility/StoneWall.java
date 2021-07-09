package CodingTest.Codility;

import java.util.*;

public class StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> stk = new Stack<>();
        int block = 0;
        
        for(int i:H){
            while(!stk.isEmpty()&&stk.peek()>i){
                stk.pop();
            }
            
            if(!stk.isEmpty()&&stk.peek()==i) continue;
            
            if(stk.isEmpty()||stk.peek()<i){
                block++;
                stk.push(i);
            }
        }
        
        return block;
    }
}
