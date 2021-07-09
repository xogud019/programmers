package CodingTest.Programmers.level2;


public class NextLargeNum {
    public static void main(String[] args){
        int n = 78;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        String s1 = Integer.toBinaryString(n);
        int count = 0;
        int answer = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)=='1'){
                count++;
            }
        }

        for(int i =n+1; ; i++){
            String s2 = Integer.toBinaryString(i);
            if(oneCount(s2)==count){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static int oneCount(String s2){
        int s2Count =0;

        for(int i=0; i<s2.length(); i++){
            if(s2.charAt(i)=='1'){
                s2Count++;
            }
        }

        return s2Count;
    }
}