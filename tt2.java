public class tt2 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        s = deleteZero(s,answer);
        answer[0]++;
        
        while(!s.equals("1")){
            answer[0]++;
            s = deleteZero(Integer.toBinaryString(s.length()),answer);
        }
        
        return answer;
    }
    
    public String deleteZero(String s, int[] answer){
        int count = 0;
        char[] temp = s.toCharArray();
        String ss = "";
        
        for(char c:temp){
            if(c=='0'){
                count++;
                continue;
            }
            else{
                ss += ""+c;
            }
        }
        
        answer[1] += count;
        
        return ss;
    }
}
