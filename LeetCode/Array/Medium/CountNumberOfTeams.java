package LeetCode.Array.Medium;

public class CountNumberOfTeams {
    //brute-force
    public int numTeams(int[] rating) {
        int answer = 0, n = rating.length;
        
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if((rating[i] < rating[j] && rating[j] < rating[k])||(rating[i] > rating[j] && rating[j] > rating[k])) answer++;
                }
            }
        }
        
        return answer;
    }
}
