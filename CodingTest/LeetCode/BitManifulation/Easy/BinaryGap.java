package CodingTest.LeetCode.BitManifulation.Easy;

public class BinaryGap {
    public int binaryGap(int n) {
        int answer = 0;
        String num = Integer.toBinaryString(n);
        int dis = 0;
        int one = 0;
        
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)=='1'){
                one++;
                answer = Math.max(dis, answer);
                dis = 1;
            }
            else dis++;
        }
        
        
        return one == 1? 0 : answer;
    }
}
