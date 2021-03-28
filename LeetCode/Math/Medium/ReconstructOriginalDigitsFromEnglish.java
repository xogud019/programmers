package LeetCode.Math.Medium;
/*
Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.

Note:
Input contains only lowercase English letters.
Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
Input length is less than 50,000.
Example 1:
Input: "owoztneoer"

Output: "012"
Example 2:
Input: "fviefuro"

Output: "45"
*/
public class ReconstructOriginalDigitsFromEnglish {
    /*
    zero(1) one(13-1-2-3) two(2) three(6-5) four(3) five(7-3) six(4) seven(9-4) eight(5) nine(14-(7-3)-4-5)
    1.z = 0
    2.w = 2
    3.u = 4
    4.x = 6
    5.g = 8
    6.h = 3, 8
    7.f = 4, 5
    8.v = 5, 7
    9.s = 6, 7
    10.r = 0, 3, 4
    11.n = 1, 7, 9
    12.t = 2, 3, 8
    13.o = 0, 1, 2, 4
    14.i = 5, 6, 8, 9
    15.e = 0, 1, 3, 5, 7, 8, 9
    */
    public String originalDigits(String s) {
        int[] alp = new int[26];
        
        for(char c:s.toCharArray()) alp[c-'a']++;
        
        int[] digit = new int[10];
        //single char
        digit[0] = alp['z'-'a'];
        digit[2] = alp['w'-'a'];
        digit[4] = alp['u'-'a'];
        digit[6] = alp['x'-'a'];
        digit[8] = alp['g'-'a'];
        //two char
        digit[3] = alp['h'-'a'] - digit[8];
        digit[5] = alp['f'-'a'] - digit[4];
        digit[7] = alp['s'-'a'] - digit[6];
        //three char
        digit[1] = alp['o'-'a'] - digit[0] - digit[2] - digit[4];
        digit[9] = alp['i'-'a'] - digit[5] - digit[6] - digit[8];
        /*
        for(int i:digit){
            System.out.print(i+" ");
        }
        */
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<digit.length; i++){
            for(int j=0; j<digit[i]; j++){
                sb.append(""+i);
            }
        }
        
        return sb.toString();
    }
}
