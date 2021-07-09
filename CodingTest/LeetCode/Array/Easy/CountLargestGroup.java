package CodingTest.LeetCode.Array.Easy;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        if(n<10) return n;
        int max = 0;
        int[] bucket = new int[n+1];
        int answer = 0;
        
        for(int i=1; i<10; i++){
            bucket[i] = 1;
        }
            
        for(int i=10; i<=n; i++){
            int idx = digitSum(i);
            bucket[idx]++;
            max = Math.max(max,bucket[idx]);
        }
        
        for(int i:bucket){
            if(max==i) answer++;
        }
        
        return answer;
    }
    
    public int digitSum(int n){
        int sum = 0;
        
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        
        return sum;
    }
}
