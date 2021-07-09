package CodingTest.Programmers.level1;

public class HarshadNumber {
    public static void main(String[] args){
        int n = 11;
        System.out.println(solution(n));
    }

    public static boolean solution(int n){
        int sum= 0;
        int m =n;
        while(m!=0){
            sum+=m%10;
            m/=10;
        }
        return n%sum==0? true:false;
    }
}