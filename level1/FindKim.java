package level1;

public class FindKim {
    public static void main(String[] args){
        String[] seoul = {"Jane","Kim"};
        System.out.println(solution(seoul));
    } 

    public static String solution(String[] seoul){
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "kim is "+i;
            }
        }

        return "ss";
    }
}