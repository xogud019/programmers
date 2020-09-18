package Programmers.level2;


public class Square {
    public static void main(String[] args){
        int w = 100000000;
        int h = 999999999;
        System.out.println(solution(w,h));
    }

    public static long solution(int w, int h){
        int gcd=  gcd(w, h);
        System.out.println(gcd);
        if(gcd==1){
            return (long)w*h-((long)w+h-1);
        }
        else{
            return (long)w*h-((long)w+h-gcd);
        }
    }

    public static int gcd(int w, int h){
        int answer = 0;
        int temp = 1;

        while(w>h?temp<=h:temp<=w){
            if(w%temp==0&&h%temp==0){
                answer = temp;
            }
            temp++;
        }
        return answer;
    }
}