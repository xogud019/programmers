package level1;

public class GetCenterString {
    public static void main(String[] args){
        String s = "abcd";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        int n = s.length();
        if (n % 2 == 0) {
            return Character.toString(s.charAt(n / 2 - 1)) + Character.toString(s.charAt(n / 2));
        } else {
            return Character.toString(s.charAt(n / 2));
        }
    }
}