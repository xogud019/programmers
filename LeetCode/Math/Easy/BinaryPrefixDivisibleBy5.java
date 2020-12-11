package LeetCode.Math.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        
        for(int i:A){
            num += i;
            list.add(num%5==0);
            num *= 2;
            num %= 5;
        }
        
        return list;
    }
}
