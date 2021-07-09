package CodingTest.LeetCode.BitManifulation.Easy;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int N) {
        String s = Integer.toBinaryString(N);
        String flip = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') flip += "0";
            else flip += "1";
        }
        
        return Integer.parseInt(flip,2);
    }
}
