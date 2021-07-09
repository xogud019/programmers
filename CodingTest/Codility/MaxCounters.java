package CodingTest.Codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] answer = new int[N];
        int max = 0;
        int temp = 0;
        for(int i:A){
            if(i<=N&&i>=1){
                if(answer[i-1] < temp) answer[i-1] = temp+1;
                else answer[i-1]++;
                
                if(max<answer[i-1]) max = answer[i-1];
                
            }
            if(i==N+1) temp = max;
            
        }
        
        for(int i=0; i<answer.length; i++){
            if(answer[i]<temp) answer[i] = temp;
        }
        return answer;
    }
    /*failed => correct 25 efficient = 60;
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] answer = new int[N];
        int max = Integer.MIN_VALUE;
        
        for(int i:A){
            if(i<=N&&i>=1){
                answer[i-1]++;
                max = Math.max(answer[i-1],max);
            }
            if(i==N+1){
                for(int j=0; j<answer.length; j++){
                    answer[j] = max;
                }
            }
        }
        
        return answer;
    }
    */
    /*failed case  => correct 100 efficient 60;
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] answer = new int[N];
        int max = 0;
       
        for(int i:A){
            if(i<=N&&i>=1){
                answer[i-1]++;
                max = Math.max(answer[i-1],max);
            }
            if(i==N+1){
                for(int j=0; j<answer.length; j++){
                    answer[j] = max;
                }
            }
        }
        
        return answer;
    }
    */
}
