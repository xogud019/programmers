package Programmers.level1;

public class ChangeStoI {
    public static void main(String[] args){
        String s = "-1234";
        System.out.println(solution(s));
    }

    public static int solution(String s){
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            String ss= s.substring(1);
            if(s.charAt(0)=='+'){
                return Integer.parseInt(ss);
            }
            else if(s.charAt(0)=='-'){
                return -Integer.parseInt(ss);
            }
        }

        return 0;
    }
}