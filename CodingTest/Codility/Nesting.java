package CodingTest.Codility;

public class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        int count = 0;
        boolean isT = true;
        
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            
            if(temp=='(') count++;
            else{
                if(count==0){
                    isT = false;
                    break;
                }
                count--;
            }
        }
        
        return isT&&count==0?1:0;
    }
}
