package LeetCode.Array.Easy;

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
}
