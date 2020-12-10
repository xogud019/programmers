package LeetCode.Array.Easy;

public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n+1];
        int answer = 0, len = n/2;
        
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=1; i<=len; i++){
            if(i*2<n+1) arr[i*2] = arr[i];
            if(i*2+1<n+1) arr[i*2+1] = arr[i] + arr[i+1];
        }
        
        for(int i:arr) answer = Math.max(answer, i);
        
        return answer;
    }
}
