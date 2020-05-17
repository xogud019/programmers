package level1;

public class StringBasic {
    public static void main(String[] args){
        String s = "a2324";
        System.out.println(solution(s));
    }

    public static boolean solution(String s){
        if(s.length()==4||s.length()==6){
            try{
                Integer.parseInt(s);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
        else{
            return false;
        }
    }
}