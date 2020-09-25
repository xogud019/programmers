package Codility;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = 0;
        
        for(int i:A){
            n = n^i;
        }
        
        return n;
    }
}
