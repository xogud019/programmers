package LeetCode.Array.Easy;
/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
*/
public class ValidMountainArray {
    //two pass
    public boolean validMountainArray(int[] arr) {
        int left = arr[0], right = arr[arr.length-1], idx = 0, jdx = 0, len = arr.length;
        
        if(len < 3) return false;
        
        //left -> right
        for(int i=1; i<len; i++){
            if(arr[i] == left) return false;
            else if(arr[i] > left) left = arr[i];
            else{
                idx = i-1;
                break;
            }
        }
        
        if(idx == 0 || idx == len-1) return false;
        
        //right -> left
        for(int i=len-2; i>=0; i--){
            if(arr[i] == right) return false;
            else if(arr[i] > right) right = arr[i];
            else{
                jdx = i+1;
                break;
            }
        }

        return idx==jdx;
    }
    /*one pass
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
    */
}
