public class testt{
    public static void main(String[] args){
        String s = "baby";
        int n = 4;
        int sIdx = 0;
        int eIdx = 0;
        int start = 0;
        
        while(sIdx < n-1){
            int max = 0;
            
            for(int i=sIdx; i<=eIdx; i++){
                if(s.charAt(i)!= s.charAt(eIdx)){
                    max = Math.max(max, eIdx-i);
                }
            }
            System.out.println(sIdx+" "+eIdx+" "+max);

            if(eIdx == n-1){
                start++;
                sIdx = start;
                eIdx = start;
            }
            else eIdx++;
            

        }
    }
    public long solution(String s) {
        long answer = 0;
        int n = s.length();
        char base = s.charAt(0);
        boolean allSame = true;
        
        for(int i=1; i<s.length(); i++){
            if(base != s.charAt(i)){
                allSame = false;
                break;
            }    
        }
        
        if(allSame) return 0;
        
        int sIdx = 0;
        int eIdx = 0;
        int start = 0;
        
        while(sIdx < n-1){
            int max = 0;
            
            for(int i=sIdx; i<=eIdx; i++){
                if(s.charAt(i)!= s.charAt(eIdx)){
                    max = Math.max(max, eIdx-i);
                }
            }
            answer += max;
            
            if(eIdx == n-1){
                start++;
                sIdx = start;
                eIdx = start;
            }
            else eIdx++;
        }
        
        return answer;
    }
}