package LeetCode.Array.Easy;
/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
*/
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
    /*
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        
        for(int i=0; i<len; i++){
            if(arr[i] == 0){
                if(i+1 < len){
                    int j = len-1;
                    
                    for(j=len-1; j>i+1; j--) arr[j] = arr[j-1];
                    
                    arr[i+1] = 0;
                    i++;
                }
            }
        }
    }
    */
}
