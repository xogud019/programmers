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

    /*
    public int hammingWeight(int n) {
        int answer = 0;
        int mask = 1;
        
        for(int i=0; i<32; i++){
            if((n&mask) != 0) answer++;
            mask <<= 1;
        }
        
        return answer;
    }
    */
    /*
    public int hammingWeight(int n){
        int sum = 0;

        while (n != 0) {
            sum++;
            n &= (n - 1);
        }

        return sum;
    }
    */
}
