package CodingTest.LeetCode.BitManifulation.Easy;

public class NumberComplement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String flip = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') flip += "0";
            else flip += "1";
        }
        
        return Integer.parseInt(flip,2);
    }
}
