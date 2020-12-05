package LeetCode.BitManifulation.Easy;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        String bit = Integer.toBinaryString(n);
        int answer = 0;
       
        for(char c:bit.toCharArray()){
            if(c == '1') answer++;
        }
        
        return answer;
    }
}
