package LeetCode.BitManifulation.Easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        
        int xor = t.charAt(0);
        
        for(int i=1;i<t.length();i++){
            xor = xor ^ t.charAt(i);
        }
        
        for(int i=0;i<s.length();i++){
            xor = xor ^ s.charAt(i);
        }
        
        return (char)xor;
    }
    /*
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int len = Math.min(arr1.length, arr2.length);
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0; i<len; i++){
            if(arr1[i] != arr2[i]) return arr2[i];
        }
        
        return arr1.length>arr2.length ? arr1[arr1.length-1] : arr2[arr2.length-1];
    }
    */
}
