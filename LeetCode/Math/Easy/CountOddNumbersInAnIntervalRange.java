package LeetCode.Math.Easy;

public class CountOddNumbersInAnIntervalRange {
    /*time out
    public int countOdds(int low, int high) {
        int answer = 0;
        
        for(int i=low; i<=high; i++){
            if(i%2==1) answer++;    
        }
        
        return answer;
    }
    */
    public int countOdds(int low, int high) {
        if((high-low+1)%2 == 0) return (high-low+1)/2; 
        else{
            if(low%2 ==  0) return (high-low+1)/2;
            else return (high-low+1)/2+1;
        }
    }
}
