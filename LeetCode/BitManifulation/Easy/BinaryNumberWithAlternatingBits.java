package LeetCode.BitManifulation.Easy;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int temp = n%2;
        n /= 2;
        
        while(n>0){
            int num = n%2;
            
            if(temp == num) return false;
            
            temp = num;
            
            n /= 2;
        }
        
        return true;
    }
}
