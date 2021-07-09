package CodingTest.LeetCode.BitManifulation.Easy;

public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        String[] arr = {"a","b","c","d","e","f"};
        
        if(num==0) return "0";
        
        StringBuilder answer = new StringBuilder();
        
        if(num > 0){
            while(num>0){
                int n = num%16;
                
                if(n>9) answer.append(arr[n%10]);
                else answer.append(""+n);
                num /= 16;
            }
            
            return answer.reverse().toString();
        }
        else{
            String s = Integer.toBinaryString(num);
            
            for(int i=0; i<s.length(); i+=4){
                int n = Integer.parseInt(s.substring(i,i+4),2);
                                         
                if(n>9) answer.append(arr[n%10]);
                else answer.append(""+n);           
            }
                                         
                return answer.toString();
        }
    }
}
