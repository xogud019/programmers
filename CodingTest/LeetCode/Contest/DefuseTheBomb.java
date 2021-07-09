package CodingTest.LeetCode.Contest;

import java.util.Arrays;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] answer = new int[len];
        Arrays.fill(answer, 0);
        
        if(k==0) return answer;
        
        if(k>0){
            for(int i=0; i<len; i++){
                int count = k;
                int idx = i;
                while(count>0){
                    answer[i] += code[(idx+1)%len];
                    idx++;
                    count--;
                }
            }
        }
        else{
            for(int i=0; i<len; i++){
                int count = -k;
                int idx = i;
                
                while(count>0){
                    if(idx-1 < 0) idx = len;
                    answer[i] += code[(idx-1)%len];
                    idx--;
                    count--;
                }
            }
        }
        
        return answer;
    }
}
