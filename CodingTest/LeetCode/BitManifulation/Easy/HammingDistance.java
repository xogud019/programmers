package CodingTest.LeetCode.BitManifulation.Easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int answer = 0;
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);

        while(s1.length()!=s2.length()){
            if(s1.length()<s2.length()) s1 = "0"+s1;
            else s2 = "0"+s2;
        }
        
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) answer++;
        }
        
        /*
        int xor = x ^ y;
        return Integer.bitCount(xor);
        */
        
        return answer;
    }
    
        
}
