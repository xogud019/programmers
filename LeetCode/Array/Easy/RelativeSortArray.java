package LeetCode.Array.Easy;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int idx = 0;
        
        for(int i=0; i<arr2.length; i++){
            int base = arr2[i];
            
            for(int j=0; j<arr1.length; j++){
                if(arr1[j] == base){
                    int temp = arr1[idx];
                    arr1[idx++] = arr1[j];
                    arr1[j] = temp;
                }    
            }
        }
        
        for(int i=idx; i<arr1.length-1; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        
        return arr1;
    }
}
