package CodingTest.LeetCode.String.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder A = new StringBuilder(a).reverse(), B = new StringBuilder(b).reverse(), rest = new StringBuilder(), answer = new StringBuilder();
        int len = 0, count = 0;
        
        if(A.length()>B.length()){
            len = B.length();
            rest = A;
        }
        else if(A.length()<B.length()){
            len = A.length();
            rest = B;
        }
        else len = A.length();
        
        for(int i=0; i<len; i++){
            int val = (A.charAt(i)-'0')^(B.charAt(i)-'0') ^ count;
            
            answer.append(val);
            
            if(A.charAt(i)-'0'  + B.charAt(i)-'0' + count > 1) count = 1;
            else count = 0;
        }
        
        if(!rest.equals("")){
            for(int i=len; i<rest.length(); i++){
                int val = (rest.charAt(i)-'0') ^ count;
            
                answer.append(val);
            
                if(rest.charAt(i)-'0' == 1 && count == 1) count = 1;
                else count = 0;
            }
        }
        
        if(count != 0) answer.append("1");
        
        return answer.reverse().toString();
    }
}
