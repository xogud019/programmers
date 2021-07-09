package CodingTest.Programmers.level2;


public class StringCompress{
    public static void main(String[] args){
        String s = "asdsdqwd";

        System.out.println(solution(s));
    }

    public static int solution(String s){
        int answer = s.length();

        for(int i =1; i<=s.length()/2; i++){
            String temp =s.substring(0, i);
            String ss = "";
            int count = 0;
            for(int j=1; j<=s.length()/i; j++){
                if(temp.equals(s.substring((j-1)*i, i*j))){
                    count++;
                }
                else{
                    if(count==1||count==0){
                        ss+= temp;
                        temp = s.substring((j-1)*i, i*j);
                        count=1;
                    }
                    else{
                        ss += count+temp;
                        temp = s.substring((j-1)*i, i*j);
                        count=1;    
                    }
                }
            }
            if(count==1||count==0){
                ss+= temp;
            }
            else{
                ss += count+temp;
            }

            if(s.length()%i!=0){
                ss +=s.substring(s.length()-s.length()%i, s.length());
            }
            answer = Math.min(ss.length(), answer);
            System.out.println(ss);
        }
        return answer;
    }
}