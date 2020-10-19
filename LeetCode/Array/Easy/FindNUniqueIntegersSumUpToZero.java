package LeetCode.Array.Easy;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            answer[i] = -n+2*i;
            answer[n-1-i] = n-2*i;
        }
        
        if(n%2==1){
            answer[n/2] = 0;
        }
        else{
            answer[n/2] -=1;
            answer[n/2+1] +=1;
        }
        
        return answer;
    }
}
