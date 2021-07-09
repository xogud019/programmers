package CodingTest.LeetCode.Array.Easy;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        
        for(int[] i : grid){
            for(int j:i) if(j<0) answer++;
        }
        
        return answer;
    }
}
