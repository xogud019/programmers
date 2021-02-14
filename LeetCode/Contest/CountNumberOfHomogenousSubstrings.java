package LeetCode.Contest;
/*
Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.

A string is homogenous if all the characters of the string are the same.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
Example 2:

Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".
Example 3:

Input: s = "zzzzz"
Output: 15
 

Constraints:

1 <= s.length <= 105
s consists of lowercase letters.
*/
public class CountNumberOfHomogenousSubstrings {
    /*time out
    static final int mod = 1000000007;
    
    public int countHomogenous(String s) {
        int len = s.length();
        HashSet<Character> set;
        int answer = len%mod;
        
        for(int i=1; i<len; i++){            
            int size = i+1;
            
            for(int j=0; j+size<len+1; j++){
                String str = s.substring(j, size+j);
                set = new HashSet<>();
                
                for(char c:str.toCharArray()) set.add(c);
                
                if(set.size()==1) answer++;
                
                answer = answer%mod;
            }
        }
        
        return answer;
    }
    */
    /* maybe mod pro?
    static final int mod = 1000000007;
    
    public int countHomogenous(String s) {
        int answer = 0, len = s.length(), idx = 0;
        List<String> list = new ArrayList<>();
        
        for(int i=1; i<len; i++){
            if(s.charAt(idx) != s.charAt(i)){
                list.add(s.substring(idx,i));
                idx = i;
            }
        }
        
        list.add(s.substring(idx, len));
        
        for(String ss:list){
            answer += ((ss.length()*(ss.length()+1)%mod)/2);
        }
        
        
        return answer;
    }
    */
}
