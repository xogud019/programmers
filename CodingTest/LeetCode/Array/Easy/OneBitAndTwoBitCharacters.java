package CodingTest.LeetCode.Array.Easy;

public class OneBitAndTwoBitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        boolean answer = false;
        
        for(int i=0; i<bits.length; i++){
            if((char)(bits[i]+'0') == '0'){
                answer = true;
            }   
            else{
                answer = false;
                i++;
            }
        }
        
        return answer;
    }
}
