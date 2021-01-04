package LeetCode.Math.Easy;
/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
Example 1:

Input: 1
Output: "A"
Example 2:

Input: 28
Output: "AB"
Example 3:

Input: 701
Output: "ZY"
*/
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if(n < 27) return ""+((char)(n+64));
        
        StringBuilder sb = new StringBuilder();
        
        while(n>26){
            int num = n%26;
            if(num==0){
                sb.append("Z");
                n--;
            } 
            else sb.append((char)(num+64));
            //System.out.println(num);
            n /= 26;
        }
        
        if(n!=0) sb.append((char)(n+64));
        
        return sb.reverse().toString();
    }
}
