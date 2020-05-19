package level1;

public class HidePhoneNumber {
    public static void main(String[] args){
        String phone_number= "01064704979";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number){
        String answer="";
        for(int i=0; i<phone_number.length(); i++){
            if(phone_number.length()-i<=4){
                answer+=phone_number.charAt(i);
            }
            else{
                answer+="*";
            }
        }

        return answer;
    }
}