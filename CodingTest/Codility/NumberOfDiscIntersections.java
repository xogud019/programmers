package CodingTest.Codility;

public class NumberOfDiscIntersections {
    /*failed case = correct 87, efficient 25;
    public int solution(int[] A) {
        int answer = 0;
        
        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if(i+A[i]>= j-A[j]) answer++;
            }
        }
        
        return answer>10000000||answer<0? -1: answer;
    }
    */
    /*failed case = correct 100, efficient 25;
    public int solution(int[] A) {
        int answer = 0;
        
        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if((long)i+(long)A[i]>= j-A[j]) answer++;
            }
        }
        
        return answer>100000000? -1: answer;
    }
    */
}
