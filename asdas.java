import java.util.*;

public class asdas {
    static int module = 1000000007;

    public static void main(String[] args){
        int N = 1041;
        int answer = 0;
        boolean isO = false;
        int count = 0;
        
        while(N>0){
            if(N%2==1){
                isO = !isO;

                if(!isO){
                    answer = Math.max(count, answer);
                    count = 0;
                    isO = !isO;
                }
            }
            else{
                if(isO){
                    count++;
                }
            }
            
            N /=2;
        }
        
        System.out.println(answer);
    }
}
