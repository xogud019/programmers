package CodingTest.Programmers.level2;


public class Fibo {
    public static void main(String[] args){
        int n  =100;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        long x1 = 0;
        long x2 = 1;
        
        return (int)fibo(x1,x2,n,0);
    }

    public static long fibo(long x1, long x2, int count, int index){
        long f1 = x1;
        long f2 = x2;

        if(index==count){
            return f1;
        }
        else{
            long f3 = (f1+f2)%1234567;
            f1 = f2;
            f2 = f3;
            index++;
            return fibo(f1, f2, count, index);
        }
    }
}