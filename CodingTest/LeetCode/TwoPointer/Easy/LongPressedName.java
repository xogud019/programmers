package CodingTest.LeetCode.TwoPointer.Easy;
/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
 

Constraints:

1.1 <= name.length <= 1000
2.1 <= typed.length <= 1000
3.name and typed contain only lowercase English letters.
*/
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()==1 && typed.length()==1) return name.equals(typed);
        int idx = 0, idy = 0;
        
        while(idx<name.length() && idy<typed.length()){
            if(name.charAt(idx)==typed.charAt(idy)){
                idx++;
                idy++;
                continue;
            }
            if(idx==0) return false;
            if(typed.charAt(idy) != name.charAt(idx) && typed.charAt(idy)==name.charAt(idx-1)){
                idy++;
                continue;
            }
            else if(typed.charAt(idy) != name.charAt(idx) && typed.charAt(idy)!=name.charAt(idx-1)){
                return false;
            }
        }
        
        if(idx != name.length()) return false;
        
        for(int i=idy; i<typed.length(); i++){
            if(typed.charAt(i) != name.charAt(idx-1)) return false;
        }
        
        return true;
    }
}
