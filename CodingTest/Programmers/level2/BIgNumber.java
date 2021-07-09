package CodingTest.Programmers.level2;


public class BIgNumber {
    public static void main(String[] args){
        String number ="10000";
        int k = 3;
        System.out.println(solution(number, k));
    }

    public static String solution(String number, int k) {
        int count = 0;
        StringBuilder s = new StringBuilder(number);
        int index=1;

        while(count<k){
            
            if(index>=1&&s.charAt(index-1)<s.charAt(index)){
                s.deleteCharAt(index-1);
                count++;
                index--;
            }    
            else{
                if(index==s.length()-1&&s.charAt(index)<=s.charAt(index-1)){
                    s.deleteCharAt(index);
                    count++;
                    index--;
                }
                else{
                    index++;
                }
            }
        }
        
        return s.toString();
    }
}