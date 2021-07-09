package CodingTest.LeetCode.Math.Easy;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    /*7ms
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        
        for(int i=A.length-3; i>=0; --i){
            if(A[i]+ A[i+1] > A[i+2]) return A[i]+A[i+1]+A[i+2];
        }
        
        return 0;
    }
    */
    /*failed case time out
    public int largestPerimeter(int[] A) {
        int answer = 0;
        int len = A.length;
        Arrays.sort(A);
        
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k= j+1; k<len; k++){
                    if(A[i]+A[j]>A[k]) answer = Math.max(answer, A[i]+A[j]+A[k]);
                }
            }
        }
        
        return answer;
    }
    */
    //9ms
    public int largestPerimeter(int[] A) {
        int answer = 0;
        int len = A.length;
        Arrays.sort(A);
        
        for(int i=0; i<len-2; i++){
            if(A[i]+A[i+1]>A[i+2]) answer = Math.max(answer, A[i]+A[i+1]+A[i+2]);
                
        }
        
        return answer;
    }
}
