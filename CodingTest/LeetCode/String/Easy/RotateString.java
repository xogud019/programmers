package CodingTest.LeetCode.String.Easy;

public class RotateString {
    public boolean rotateString(String A, String B) {
        if(A.equals("") && B.equals("")) return true;
        else if(A.equals("") && !B.equals("")) return false;
        else if(!A.equals("") && B.equals("")) return false;
        
        StringBuilder sb = new StringBuilder(A);
        char cc = A.charAt(0);
        sb.deleteCharAt(0);
        sb.append(cc);
        
        while(!sb.toString().equals(A)){
            if(sb.toString().equals(B)) return true; 
            
            char c = sb.toString().charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
        }
        
        return false;
    }
}
