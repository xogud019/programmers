package CodingTest.LeetCode.Math.Medium;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= num <= 3999
*/
public class IntegerToRoman {
    //brute force
    public String intToRoman(int num) {
        int thod = num/1000;
        int hund = (num%1000)/100;
        int ten = ((num%1000)%100)/10;
        int one = num%10;
        
        String[] tt = {"M", "MM", "MMM"};
        String[] h = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] t = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] o = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        
        StringBuilder sb = new StringBuilder();
        
        if(thod != 0) sb.append(tt[thod-1]);
        if(hund != 0) sb.append(h[hund-1]);
        if(ten != 0) sb.append(t[ten-1]);
        if(one != 0) sb.append(o[one-1]);
        
        return sb.toString();
    }

    /*recursion
    StringBuilder str = new StringBuilder();
    int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] syms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public String intToRoman(int num) {
        recursion(0, num);
        return str.toString();
    }
    
    void recursion(int i, int r) {
        if (r == 0) return;
        if (r >= vals[i]) {
            for (int j = 0; j < r / vals[i]; j++) str.append(syms[i]);
        }
        recursion(i + 1, r % vals[i]);
    }
    */
}
