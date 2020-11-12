package LeetCode.Math.Easy;

public class Maximum69Number {
    public int maximum69Number (int num) {
        char[] arr = Integer.toString(num).toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '9') continue;
            else{
                arr[i] = '9';
                String n = new String(arr);
                return Integer.parseInt(n);
            } 
        }
        
        String n = new String(arr);
        
        return Integer.parseInt(n);
    }
}
