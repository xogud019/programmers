package CodingTest.Codility;

public class GenomicRangeQuery {
    /*failed case = correct 100, efficient 0;
    public int[] solution(String S, int[] P, int[] Q) {
        int[] answer = new int[P.length];
        // write your code in Java SE 8
        for(int i=0; i<P.length; i++){
            int min = Integer.MAX_VALUE;
            
            for(int j=P[i]; j<=Q[i]; j++){
                int val = 0;
                char temp = S.charAt(j);
                
                if(temp=='A'){
                    val = 1;
                    min = Math.min(min,val);
                }
                else if(temp=='C'){
                    val = 2;
                    min = Math.min(min,val);

                }
                else if(temp=='G'){
                    val = 3;
                    min = Math.min(min,val);
                }
                else{
                    val = 4;
                    min = Math.min(min,val);
                }
                
            }
            
            answer[i] = min;
        }
        
        return answer;
    }
    */
}
