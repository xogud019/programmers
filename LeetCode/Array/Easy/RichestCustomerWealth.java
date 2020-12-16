package LeetCode.Array.Easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        
        for(int[] i:accounts){
            int max = 0;
            
            for(int j:i) max += j;    
            
            answer = Math.max(max,answer);
        }
        
        return answer;
    }
}
