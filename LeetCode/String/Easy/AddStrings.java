package LeetCode.String.Easy;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int idx = num1.length()-1;
        int idy = num2.length()-1;
        int carry = 0;
        
        while(idx>=0 || idy>=0){
            int v1 = idx>=0 ? num1.charAt(idx)-'0':0;
            int v2 = idy>=0 ? num2.charAt(idy)-'0':0;
            int val = (v1+v2+carry)%10;
            carry = (v1+v2+carry)/10;
            
            sb.append(val);
            
            idx--;
            idy--;
        }
        
        if(carry != 0) sb.append(carry);    
        
        return sb.reverse().toString();
    }
}
