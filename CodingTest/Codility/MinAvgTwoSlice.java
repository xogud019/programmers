package CodingTest.Codility;
//try again
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double minAvg = (A[0]+A[1])/2f;
        int answer = 0;
        
        for(int i=2; i<A.length; i++){
            double avg = (A[i-2]+A[i-1]+A[i])/3f;
            
            if(minAvg>avg){
                minAvg = avg;
                answer = i-2;
            }
            
            avg = (A[i-1]+A[i])/2f;
            
            if(minAvg>avg){
                minAvg = avg;
                answer = i-1;
            }
        }
        
        return answer;
    }
}
