package CodingTest.Programmers.level1;

public class WeirdString {
    public static void main(String[] args){
        String s = " AAA A A A  ";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        String answer="";
        String ss = s.replaceAll(" ", "_");
        String[] temp = ss.split("_",-1);
        String tempS ="";
        for(int i=0; i<temp.length; i++){
            if(temp[i].isEmpty()){
                answer+=" ";
                continue;
            }
            for(int j=0; j<temp[i].length(); j++){
                if(j%2==0){
                    tempS = Character.toString(temp[i].charAt(j));
                    answer += tempS.toUpperCase();
                    tempS ="";
                }
                else{
                    tempS = Character.toString(temp[i].charAt(j));
                    answer += tempS.toLowerCase();
                    tempS="";
                }
            }
            if(i!=temp.length-1){
                answer+=" ";
            }
        }
        
        if(answer.length()>s.length()){
            return answer.substring(0, answer.length()-1);
        }

        return answer;
    }
}