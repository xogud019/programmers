package Note;

public class temp {
    /*
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<right+1; i++){
            int cnt = 0;
            
            for(int j=1; j*j<=i; j++){
                if(i%j == 0){
                    cnt++;
                    if(j*j < i) cnt++;
                }
            }
            
            if(cnt%2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    */
    /*
    public long[] solution(long[] numbers) {
        int len  = numbers.length;
        long[] answer = new long[len];
        
        for(int i=0; i<len; i++){
            String bin = Long.toBinaryString(numbers[i]);
            long num = numbers[i]+1;
            
            if(num%4 != 0) answer[i] = num;
            else{
                if(!bin.contains("0")){
                    bin = bin.substring(0,1)+"0"+bin.substring(1, bin.length());
                    answer[i] = Long.parseLong(bin,2);
                }
                else{
                    for(int j = bin.length()-1; j > 0; j--){
                        if(bin.charAt(j)=='1' && bin.charAt(j-1)=='0'){
                            char[] ch = bin.toCharArray();
                            ch[j] = '0';
                            ch[j-1] = '1';
                            
                            bin = new String(ch);
                            
                            answer[i] = Long.parseLong(bin,2);
                            break;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    */
}
