package CodingTest.LeetCode.Math.Easy;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] answer = new int[N+1];
        
        for(int i=0; i<N; i++){
            if(S.charAt(i)=='I') answer[i] = lo++;
            else answer[i] = hi--;
        }
        
        answer[N] = lo;
        
        return answer;
    }
}
