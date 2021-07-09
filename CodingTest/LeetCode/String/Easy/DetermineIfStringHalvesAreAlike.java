package CodingTest.LeetCode.String.Easy;
/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:

Input: s = "MerryChristmas"
Output: false
Example 4:

Input: s = "AbCdEfGh"
Output: true
 

Constraints:

1.2 <= s.length <= 1000
2.s.length is even.
3.s consists of uppercase and lowercase letters.
*/
public class DetermineIfStringHalvesAreAlike {
    /*
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2, l = 0, r = 0;
        String vowel = "aeiouAEIOU";
        
        for(int i=0; i<len; i++){
            if(vowel.contains(""+s.charAt(i))) l++;
            if(vowel.contains(""+s.charAt(len+i))) r++;
        }
        
        return l==r;
    }
    */
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String s1 = s.substring(0,len/2);
        String s2 = s.substring(len/2,len);
        String alike = "aeiouAEIOU";
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(char c:s1.toCharArray()){
            if(alike.contains(""+c)) cnt1++;
        }
        
        for(char c:s2.toCharArray()){
            if(alike.contains(""+c)) cnt2++;
        }
        return cnt1 == cnt2;
    }
}
