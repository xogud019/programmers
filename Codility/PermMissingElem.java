package Codility;

public class PermMissingElem {
    class Solution {
        //correct = 100 efficient = 60;
        /*
        public int solution(int[] A) {
            // write your code in Java SE 8
            int n = A.length+1;
            int sum = 0;
            
            for(int i:A){
                sum+=i;
            }
            
            return (n*(n+1))/2 - sum;
        }
        */
        public int solution(int[] A) {
            // write your code in Java SE 8
            int n = A.length+1;
            int total = 0;
            
            for(int i=1; i<=n; i++){
                total += i;
            }
            
            for(int i:A){
                total -= i;
            }
            
            return total;
        }
    }
}
