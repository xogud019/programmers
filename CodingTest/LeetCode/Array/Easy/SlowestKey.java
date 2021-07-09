package CodingTest.LeetCode.Array.Easy;

public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char answer = keysPressed.charAt(0);
        int time = releaseTimes[0];
        int max = releaseTimes[0];
        
        for(int i=1; i<keysPressed.length(); i++){
            if(releaseTimes[i]-time > max){
                max = releaseTimes[i]-time;
                answer = keysPressed.charAt(i);
            }
            else if(releaseTimes[i]-time == max){
                if(keysPressed.charAt(i) > answer) answer = keysPressed.charAt(i);
            }
            
            time = releaseTimes[i];
            System.out.println(answer);
        }
        return answer;
    }
}
