package CodingTest.LeetCode.TwoPointer.Easy;
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
1.1 <= arr.length <= 104
2.0 <= arr[i] <= 104
*/
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length==1 ||arr.length==2) return false;
        
        int i = 1, j = arr.length-2;
        int base = 0;
        
        while(arr[i-1]<arr[i]){
            base = i;
            i++;
            
            if(i==arr.length) break;
        }
        if(base ==0) return false;
        if(base == arr.length-1) return false;
        
        while(j>=base){
            if(arr[j]>arr[j+1]){
                j--;
            }
            else return false;
        }
        
        return true;
    }
}
