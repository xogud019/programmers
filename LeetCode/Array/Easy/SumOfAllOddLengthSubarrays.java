package LeetCode.Array.Easy;

public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j+=2){
                for(int k=i; k<=j; k++){
                    answer += arr[k];
                }
            }
        }
        
        return answer;
    }
}
