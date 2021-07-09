package CodingTest.LeetCode.BackTracking.Easy;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int answer = 0;
        
        while(n>1){
            answer += n/2;
            
            if(n%2 == 0) n /=2;
            else n = n/2 + +1;
        }
        
        return answer;
    }
}
