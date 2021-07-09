package CodingTest.LeetCode.String.Easy;

public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        number = number.replaceAll("[- ]","");
        if(number.length()==2 || number.length()==3) return number;
        if(number.length()==4){
            sb.append(number.substring(0,2));
            sb.append("-");
            sb.append(number.substring(2,4));
            return sb.toString();
        }
        
        int idx = 0;
        int len = number.length();
        
        while(idx<number.length()){
            //System.out.println(idx+" "+len);
            if(len>4){
                sb.append(number.substring(idx,idx+3));
                sb.append("-");
                idx +=3;
                len -=3;
            }
            else if(len == 4){
                sb.append(number.substring(idx,idx+2));
                idx +=2;
                sb.append("-");
                sb.append(number.substring(idx,idx+2));
                idx +=2;
                len -=4;
            }
            else if(len == 3){
                sb.append(number.substring(idx,idx+3));
                idx+=3;
                len -=4;
            }
            else if(len == 2){
                sb.append(number.substring(idx,idx+2));
                idx+=2;
                len -=2;

            }
        }
        
        if(sb.charAt(sb.length()-1) == '-') return sb.substring(0,sb.length()-1).toString();
        else return sb.toString();
    }
}
