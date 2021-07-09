package CodingTest.LeetCode.Greedy.Easy;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        int answer = 0;
        
        for(int i=0; i<A[0].length(); i++){
            for(int j=0; j<A.length-1; j++){
                if(A[j].charAt(i)>A[j+1].charAt(i)){
                    answer++;
                    break;
                }
            }    
        }
        
        return answer;
    }
}
