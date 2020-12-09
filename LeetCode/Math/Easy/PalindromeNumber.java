package LeetCode.Math.Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        String s = Integer.toString(x);
        int i = 0, j = s.length()-1;
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }

    /*public boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return x == revertedNumber || x == revertedNumber/10;
    }
    */
}
