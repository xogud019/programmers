package Programmers.level1;

public class Caesar {
    public static void main(String[] args){
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s,n));
    }

    public static String solution(String s, int n){
        String answer ="";
        int a= (int)'a';
        int z= (int)'z';
        int A= (int)'A';
        int Z= (int)'Z';

        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))==true){
                if((int)s.charAt(i)+n>z){
                    answer+=(char)((int)s.charAt(i)+n+a-z-1);
                }
                else{
                    answer+=(char)((int)s.charAt(i)+n);

                }
            }
            else if(s.charAt(i)==' '){
                answer+= ' ';

            }
            else{
                if((int)s.charAt(i)+n>Z){
                    answer+=(char)((int)s.charAt(i)+n+A-Z-1);
                }
                else{
                    answer+=(char)((int)s.charAt(i)+n);

                }
            }
        }
        return answer;
    }
}