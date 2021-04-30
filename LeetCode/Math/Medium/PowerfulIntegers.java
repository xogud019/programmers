package LeetCode.Math.Medium;

import java.util.ArrayList;
import java.util.List;

public class PowerfulIntegers {
    //brute force
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> answer = new ArrayList<>();
        
        int i = 0;
        
        while((int)Math.pow(x, i) <= bound){
            int a = (int)Math.pow(x, i), j = 0;
            //System.out.print(a+" : ");
            //if(!answer.contains(a)) answer.add(a);
            
            while((int)Math.pow(y, j) <= bound){
                int b = (int)Math.pow(y, j);
                //System.out.print(b+" ");
                //if(!answer.contains(b)) answer.add(b);
                if(a+b <= bound && !answer.contains(a+b)) answer.add(a+b);
                //System.out.println();
                if(y==1) break;
                j++;
            }
            if(x==1) break;
            
            i++;
        }
        
        
        return answer;
    }
    
    /*using set
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=1; i<=bound; i*=x){
            for(int j=1; i+j<=bound; j*=y){
                set.add(i+j);
                
                if(y == 1) break;
            }
            
            if(x == 1) break;
        }
        
        return new ArrayList(set);
    }
    */
}
