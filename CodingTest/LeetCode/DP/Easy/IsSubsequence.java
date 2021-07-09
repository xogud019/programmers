package CodingTest.LeetCode.DP.Easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;
        
        while(true){
            if(sIdx == s.length()) return true;
            if(sIdx<s.length()&&tIdx == t.length()) break;
            if(s.charAt(sIdx)== t.charAt(tIdx)){
                sIdx++;
                tIdx++;
            }
            else{
                tIdx++;
            }
        }
        return false;
    }
}
