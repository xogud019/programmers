package CodingTest.LeetCode.TwoPointer.Easy;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 

Constraints:
1.s consists only of printable ASCII characters.
*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        s = s.toLowerCase();
        
        while(start<=end){
            char front = s.charAt(start);
            char back = s.charAt(end);
            
            if(!isValid(back)){
                end--;
                continue;
            }
            if(!isValid(front)){
                start++;
                continue;
            } 
            
            if(front!=back) return false;
            start++;
            end--;
        }
        
        return true;
    }
    
    public boolean isValid(char c){
        if(c>='a' && c<='z' || c>='0' && c<='9' || c>='A' && c<='Z'){
            return true;
        }
        return false;
    }
}
