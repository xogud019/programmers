package LeetCode.String.Medium;
/*
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
*/
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String[] num1 = a.split("\\+"), num2 = b.split("\\+");
        //int R = 0, I = 0, img1 = 0, img2 = 0, rel1 = 0, rel2 = 0;
        
        int img1 = Integer.parseInt(num1[1].substring(0,num1[1].length()-1));
        int img2 = Integer.parseInt(num2[1].substring(0,num2[1].length()-1));
        int rel1 = Integer.parseInt(num1[0]);
        int rel2 = Integer.parseInt(num2[0]);
        int R = (rel1*rel2) + (img1*img2*(-1));
        int I = (rel1*img2) + (rel2*img1);
        
        return R+"+"+I+"i";
    }
}
