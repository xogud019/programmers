package LeetCode.Math.Medium;
/*
Starting with a positive integer N, we reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this in a way such that the resulting number is a power of 2.

 

Example 1:

Input: 1
Output: true
Example 2:

Input: 10
Output: false
Example 3:

Input: 16
Output: true
Example 4:

Input: 24
Output: false
Example 5:

Input: 46
Output: true
 

Note:

1 <= N <= 10^9
*/
public class ReorderedPowerOfTwo {
    //using permutation 1834ms
    public boolean reorderedPowerOf2(int N) {
        if(N < 3) return true;
        String str = Integer.toString(N);
        char[] arr = str.toCharArray();
        
        return perm(arr, 0);
    }
    /*
    public void perm(char[] arr, int idx){
        if(idx == arr.length){
            print(arr);
        }
        
        for(int i=idx; i<arr.length; i++){
            swap(arr, i, idx);
            perm(arr, idx+1);
            swap(arr, i, idx);
        }
    }
    */
    public boolean perm(char[] arr, int idx){
        if(idx == arr.length){
            return isPowerOfTwo(arr);
        }
        
        for(int i=idx; i<arr.length; i++){
            swap(arr, i, idx);
            if(perm(arr, idx+1)) return true;;
            swap(arr, i, idx);
        }
        
        return false;
    }
    
    public boolean isPowerOfTwo(char[] arr){
        if(arr[0] == '0') return false;
        
        String str = new String(arr);
        int n = Integer.parseInt(str);
        int count  = 0;
        //System.out.print(n+" ");
        while(n>1){
            if(n%2==1) count++;
            
            n /=2;
        }
        //System.out.println(count);
        return count == 0;
    }
    
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void print(char[] arr){
        for(char c:arr) System.out.print(c+" ");
        System.out.println();
    }

    /*using math 1ms
    public boolean reorderedPowerOf2(int N) {
        int[] arr = count(N);
        
        for(int i=0; i<30; i++){
            if(Arrays.equals(arr, count(1<<i))) return true;
        }
        
        return false;
    }
    
    public int[] count(int n){
        int[] arr = new int[10];
        
        while(n>0){
            arr[n%10]++;
            
            n /= 10;
        }
        
        return arr;
    }
    */
}
