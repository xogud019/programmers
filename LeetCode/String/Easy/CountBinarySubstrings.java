package LeetCode.String.Easy;

public class CountBinarySubstrings {
    /*time out
    public int countBinarySubstrings(String s) {
        int answer = 0 , idx1 = 0, idx2 = 1;
        int val = 2;
        
        //System.out.println(s.substring(0,5));
        while(idx2 <= s.length()){
            //System.out.println("outer"+idx1+" "+idx2);
            
            while(idx2 <= s.length()){
                if(count(s.substring(idx1, idx2))){
                    answer++;
                    //System.out.println(idx1+" "+idx2+" "+s.substring(idx1,idx2));
                } 
                idx1++;
                idx2++;
            }
            
            idx1 = 0;
            idx2 = val++;
            //System.out.println();
        }
        
        return answer;
    }
    
    public boolean count(String s){
        if(s.length()==1) return false;
        if(s.length()%2== 1) return false;
        int len = s.length();
        
        for(int i=1; i<len/2; i++){
            if(s.charAt(i-1) != s.charAt(i)) return false;
        }
        
        if(s.charAt(len/2-1) == s.charAt(len/2)) return false;
        
        for(int i=len/2+1; i<len; i++){
            if(s.charAt(i-1) != s.charAt(i)) return false;
        }
        
        return true;
    }
    */
}
