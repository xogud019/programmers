public class t2 {
    public String solution(String encrypted_text, String key, int rotation) {
        char[] dec = encrypted_text.toCharArray();
        int[] keyNum = new int[key.length()];
        
        for(int i=0; i<keyNum.length; i++){
            keyNum[i] = key.charAt(i)-'a'+1;
        }
        //a 97 z 122  A 65 Z 90
        rotate(dec, rotation);
        /*
        for(char c: dec){
            System.out.print(c+" ");
        }
        System.out.println();
        */
        for(int i=0; i<dec.length; i++){
            int temp = (int)dec[i]-keyNum[i];
            if(temp<97) temp+=26;
            else if(temp>122) temp -=26;

            dec[i] = (char)temp;
        }
        
        /*
        for(int i:keyNum){
            System.out.print(i+" ");
        }
        System.out.println();
        for(char c: dec){
            System.out.print(c+" ");
        }
        */
        return String.valueOf(dec);
    }
    
    public void rotate(char[] arr, int rotation){
        if(rotation>0){
            for(int i=0; i<rotation; i++){
                char temp = arr[0];
            
                for(int j=1; j<arr.length; j++){
                    arr[j-1] = arr[j];
                }
            
                arr[arr.length-1] = temp;
            }    
        }
        else{
            for(int i=0; i<Math.abs(rotation); i++){
                char temp = arr[arr.length-1];
                
                for(int j = arr.length-1; j>0; j--){
                    arr[j] = arr[j-1];
                }
            
                arr[0] = temp;
            }
        }
        
    }
}
