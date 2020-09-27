public class MaxCounters {
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
