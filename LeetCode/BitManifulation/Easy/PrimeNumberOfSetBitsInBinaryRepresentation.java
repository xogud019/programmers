package LeetCode.BitManifulation.Easy;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int answer = 0;
        
        for(int i=L; i<=R; i++){
            int bit = Integer.bitCount(i);
            
            if(bit==1) continue;
            
            if(isPrime(bit)) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(int n){
        if(n==2) return true;
        
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        
        return true;
    }
    /*
    public int countPrimeSetBits(int L, int R) {
        int answer = 0;
        
        for(int i=L; i<=R; i++){
            int count = 0;
            String bin = Integer.toBinaryString(i);
            
            for(int j=0; j<bin.length(); j++){
                if(bin.charAt(j)=='1') count++;
            }
            
            if(count == 1) continue;
            
            if(isPrime(count)) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(int n){
        if(n==2) return true;
        
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        
        return true;
    }
    */
}
