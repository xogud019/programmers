package LeetCode.Array.Easy;
/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.
 

Constraints:

1 <= arr.length <= 104
1 <= arr[i] <= 105
*/
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        //speed 1
        int base = arr[arr.length-1];
        
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<base) arr[i] = base;
            else{
                int temp = base;
                base = arr[i];
                arr[i] = temp;
            }
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
        /*speed 140
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i] = -1;
                break;
            }
            
            int max = 0;
            
            for(int j=i+1; j<arr.length; j++){
                max = Math.max(arr[j],max);    
            }
            
            arr[i] = max;
        }
        
        return arr;
        
        */
        


    }


    /*brute force left -> right
    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int max = 0;
                
            for(int j=i+1; j<arr.length; j++) max = Math.max(max, arr[j]);
                
            arr[i] = max;
        }
            
        arr[arr.length-1] = -1;
            
        return arr;
    }
    */

    /*right -> left
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = arr[len-1];
        arr[len-1] = -1;
        
        for(int i=len-2; i>=0; i--){
            if(arr[i] < max) arr[i] = max;
            else{
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        
        return arr;
    }
    */
}
