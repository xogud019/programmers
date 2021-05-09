package LeetCode.Math.Hard;

import java.util.ArrayList;
import java.util.List;
/*
Let's say a positive integer is a super-palindrome if it is a palindrome, and it is also the square of a palindrome.

Given two positive integers left and right represented as strings, return the number of super-palindromes integers in the inclusive range [left, right].

 

Example 1:

Input: left = "4", right = "1000"
Output: 4
Explanation: 4, 9, 121, and 484 are superpalindromes.
Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
Example 2:

Input: left = "1", right = "2"
Output: 1
 

Constraints:

1 <= left.length, right.length <= 18
left and right consist of only digits.
left and right cannot have leading zeros.
left and right represent integers in the range [1, 1018].
left is less than or equal to right.
*/
public class SuperPalindromes {
    /*time limited
    public int superpalindromesInRange(String left, String right) {
        long l = Long.parseLong(left), r = Long.parseLong(right);
        int answer = 0;
        
        for(long i=l; i<=r; i++){
            if(pal(i) && ((long)Math.sqrt(i) == Math.sqrt(i) && pal((long)Math.sqrt(i)))) answer++;
        }
        
        return answer;
    }
    
    public boolean pal(long n){
        String str = ""+n;
        
        int i = 0, j = str.length()-1;
        
        while(i<=j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        
        return true;
    }
    */
    //10^8 = 1s
    //10^18  =  10^9 * 10^9  =  (10^4*10*10^4)*(10^4*10*10^4)
    public int superpalindromesInRange(String left, String right) {
        long le = Long.parseLong(left), ri = Long.parseLong(right);
        int answer = 0;
        List<Long> list = new ArrayList<>();
        //add < 10
        list.add((long)1);
        list.add((long)2);
        list.add((long)3);
        
        
        for(int i=1; i<10000; i++){
            StringBuilder l = new StringBuilder(""+i), r = new StringBuilder(""+i);
            r.reverse();
            //add even num    
            list.add(Long.parseLong(l.toString()+r.toString()));
            
            //add odd num
            for(int digit=0; digit<10; digit++){
                StringBuilder num = new StringBuilder(l+""+digit+""+r);
                
                list.add(Long.parseLong(num.toString()));
            }
        }
        
        for(long n : list){
            long sqr = n*n;
            //if(sqr > ri) break;
            
            if(sqr >= le && sqr <= ri && pal(sqr)){
                answer++;}
        }
        
        return answer;
    }
    
    public boolean pal(long val){
        String str = Long.toString(val);
        int i = 0, j = str.length()-1;
        
        while(i<=j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        
        return true;
    }
}
