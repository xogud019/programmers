package LeetCode.Easy;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(!haystack.contains(needle)) return -1;
        int answer = 0;
        
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                answer = i;
                int count = i+1;
                int idx = 1;
                while(idx<needle.length()){
                    if(haystack.charAt(count)==needle.charAt(idx)){
                        count++;
                        idx++;
                    }
                    else break;
                }
                
                if(idx==needle.length()) break;
            }
        }
        return answer;   
    }
}
