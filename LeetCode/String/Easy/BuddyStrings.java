package LeetCode.String.Easy;
/*
Given two strings A and B of lowercase letters, return true if you can swap two letters in A so the result is equal to B, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at A[i] and A[j]. For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

 

Example 1:

Input: A = "ab", B = "ba"
Output: true
Explanation: You can swap A[0] = 'a' and A[1] = 'b' to get "ba", which is equal to B.
Example 2:

Input: A = "ab", B = "ab"
Output: false
Explanation: The only letters you can swap are A[0] = 'a' and A[1] = 'b', which results in "ba" != B.
Example 3:

Input: A = "aa", B = "aa"
Output: true
Explanation: You can swap A[0] = 'a' and A[1] = 'a' to get "aa", which is equal to B.
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
Example 5:

Input: A = "", B = "aa"
Output: false
 

Constraints:
1.0 <= A.length <= 20000
2.0 <= B.length <= 20000
3.A and B consist of lowercase letters.
*/

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        
        if(A.equals(B)){
            int[] arr = new int[26];
            
            for(char c:A.toCharArray()){
                arr[c-'a']++;
            }
            
            for(int i:arr){
                if(i>1) return true;
            }
            
            return false;
        }
        
        int count = 0;
        int idx = 0;
        char[] map = new char[4];
        
        for(int i=0; i<A.length(); i++){
            char v1 = A.charAt(i);
            char v2 = B.charAt(i);
            
            if(v1 != v2){
                count++;
                if(count >2) return false;
                
                map[idx] = v1;
                map[idx+1] = v2;
                idx+=2;
            }
        }
        
        return map[0]==map[3] && map[1]==map[2];
    }
}
