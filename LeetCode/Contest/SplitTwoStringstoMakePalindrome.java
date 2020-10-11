package LeetCode.Contest;

public class SplitTwoStringstoMakePalindrome {
    /*failed case
    public boolean checkPalindromeFormation(String a, String b) {
        StringBuilder aPre;
        StringBuilder aSuf;
        StringBuilder bPre;
        StringBuilder bSuf;
        int len = a.length();
        
        if(len == 1) return true;
        
        for(int i = 0; i<=len; i++){
            aPre = new StringBuilder(a.substring(0,i));
            aSuf = new StringBuilder(a.substring(i,len));
            bPre = new StringBuilder(b.substring(0,i));
            bSuf = new StringBuilder(b.substring(i,len));
            
            if(aPre.indexOf(bSuf.reverse().toString()) != -1||bPre.indexOf(aSuf.reverse().toString()) != -1) return true;
        }
        
        return false;
    }
    
    public boolean isPalin(StringBuilder a, StringBuilder b){
        String s = a.append(b).toString();
        int n = s.length();
            for (int i = 0; i < (n/2); ++i) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    return false;
                }
        }
        return true;
    }
    */
}
