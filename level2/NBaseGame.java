package level2;

public class NBaseGame {
    public static void main(String[] args){
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        System.out.println(solution(n, t, m, p));
    }

    public static String solution(int n, int t, int m, int p) {
        String answer =""; 
        String line = BaseList(t*m, n);
        System.out.println(line);
        for(int i=0; i<line.length(); i++){
            if(i%m==p-1){ 
                answer += line.charAt(i);
            }
        }
        return answer;
    }

    public static String BaseList(int num, int n){
        String s = "";
        int start = 0;

        while(s.length()<num){
            s+=makeBase(start, n);
            start++;
        }

        return s.substring(0, num);
    }

    public static String makeBase(int num, int n){
        String s = "";

        while(num!=0){
            int mod = num%n;
            if(mod<10){
                s = ""+num%n+s;
            }
            else{
                s = ""+(char)(65+(mod-10))+s;
            }
            
            num/=n;
        }
        if(s==""){
            return "0";
        }
        return s;
    }
}