package LeetCode.Math.Medium;
/*
We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.

The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].

The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].

Return true if and only if the number of global inversions is equal to the number of local inversions.

Example 1:

Input: A = [1,0,2]
Output: true
Explanation: There is 1 global inversion, and 1 local inversion.
Example 2:

Input: A = [1,2,0]
Output: false
Explanation: There are 2 global inversions, and 1 local inversion.
Note:

A will be a permutation of [0, 1, ..., A.length - 1].
A will have length in range [1, 5000].
The time limit for this problem has been reduced.
*/
public class GlobalAndLocalInversions {
    /*math 1ms
    public boolean isIdealPermutation(int[] A) {
        if(A.length<3) return true;
        
        for(int i=0; i<A.length; i++){
            if(Math.abs(A[i]-i) >= 2) return false;
        }
        
        return true;
    }
    */
    //brute force 629ms
    public boolean isIdealPermutation(int[] A) {
        if(A.length < 3) return true;
        
        int global = 0, local = 0;
       
        
        //The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
        //The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]) local++;
            for(int j=i+1; j<A.length; j++){
                if(A[i] > A[j]) global++;
            }
        }
        
        return global == local;
    }
    /*miss understand(problem)
    int gob, loc;
    
    public boolean isIdealPermutation(int[] A) {
        gob = 0; 
        loc = 0;
        perm(A, 0);
        System.out.println(gob+" "+loc);
        return gob == loc;
    }
    
    public void perm(int[] A, int idx){
        if(idx == A.length){
            if(global(A)) gob++;
            if(local(A)) loc++;
            print(A);
            return;
        }
        
        for(int i=idx; i<A.length; i++){
            swap(A, i, idx);
            perm(A, idx+1);
            swap(A, i, idx);
        }
    }
    
    public boolean global(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] <= arr[j]) return false;
            }
        }
        
        return true;
    }
    
    public boolean local(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]) return false;
        }
        
        return true;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void print(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
        
        return;
    }
    */
}
