package level1;

public class GCMLCM {
    public static void main(String[] args){
        int n= 2;
        int m =5;
        int[] result = solution(n,m);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int n, int m){
        int[] answer = new int[2];
        int big = 0;
        int sma = 0;
        int temp=0;
        if(m>n){
            big = m;
            sma = n;
        }        
        else{
            big = n;
            sma = m;
        }

        while(true){
            if(big%sma==0||sma==1){
                break;
            }
            else{
                temp = big%sma;
                big = sma;
                sma = temp;
            }
        }

        answer[0]=sma;
        answer[1]=(m*n)/sma;
        return answer;
    }
}