package LeetCode.Array.Easy;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 0){
                shift(arr,i+1);
                arr[i+1] = 0;
                i++;
            }
        }
    }
    
    public void shift(int[] arr, int idx){
        for(int i=arr.length-1; i>idx; i--){
            arr[i] = arr[i-1];
        }
    }
}
