package CodingTest.LeetCode.String.Easy;
/*
Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Example 1:
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:
Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
Note:

s.length will be between 1 and 50,000.
s will only consist of "0" or "1" characters.
*/
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int answer = 0, prev = 0, cur = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                answer += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }
            else cur++;
        }
        
        return answer+Math.min(cur,prev);
    }
    /*
    public int countBinarySubstrings(String s) {
        int answer = 0, prev = 0, cur = 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                //System.out.println(i+" "+prev+" "+cur);
                answer += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }
            else cur++;
        }
        
        return answer+Math.min(prev,cur);
    }
    */
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
