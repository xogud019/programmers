package CodingTest.LeetCode.Math.Easy;

import java.util.List;
import java.util.ArrayList;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=left; i<=right; i++){
            if(self(i)) answer.add(i);
        }
        
        return answer;
    }
    
    public boolean self(int num){
        int base = num;
        
        while(num>0){
            int div = num%10;
            
            if(div == 0) return false;
            if(base%div != 0) return false;
            
            num /=10;
        }
        
        return true;
    }
}
