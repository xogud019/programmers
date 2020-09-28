package Codility;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[1000001];
        int answer = 0;
        
        for(int i:A){
            if(i<=0) continue;
            arr[i] = 1;
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
