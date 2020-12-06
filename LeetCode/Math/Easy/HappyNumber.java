package LeetCode.Math.Easy;

import java.util.ArrayList;

public class HappyNumber {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int num = 0;
            
            while(n>0){
                int s = n%10;
                
                num += s*s;
                
                n /= 10;
            }
            
            if(num == 1) return true;
            else{
                if(list.contains(num)) return false;
                else list.add(num);
            }
            
            n = num;
        }
    }
}
