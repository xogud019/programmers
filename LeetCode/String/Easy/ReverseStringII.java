package LeetCode.String.Easy;
/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr =  s.toCharArray();
        
        for(int i=0; i<arr.length; i += 2*k){
            int idx = i, idy = Math.min(arr.length-1, i+k-1);
            
            while(idx<idy){
                char temp = arr[idx];
                arr[idx++] = arr[idy];
                arr[idy--] = temp;
            }
        }
        
        return new String(arr);
    }
    /*two pointer brute force
    public String reverseStr(String s, int k) {
        int count = 0;
        boolean rev = true;
        char[] arr =  s.toCharArray();
        int last = 0;
        
        for(int i=0; i<s.length(); i++){
            count++;
            
            if(count == k){
                if(rev){
                    rev = false;
                    int hi = i, lo = i-(k-1);
                    
                    while(lo<hi){
                        char temp = arr[lo];
                        arr[lo] = arr[hi];
                        arr[hi] = temp;
                        
                        lo++;
                        hi--;
                    }
                    
                    count = 0;
                }
                else{
                    rev = true;
                    count = 0;
                }
                
                last = i+1;
                continue;
            }
        }
        
        if(rev){
            int len = arr.length-1;
            
            while(last<len){
                char temp = arr[last];
                arr[last] = arr[len];
                arr[len] =  temp;
                
                last++;
                len--;
            }
        }
        
        return new String(arr);
    }
    */
}
