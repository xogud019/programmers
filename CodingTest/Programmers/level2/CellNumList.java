package CodingTest.Programmers.level2;


public class CellNumList {
    public static void main(String[] args){
        String[] phone_book = {"12", "123", "1235"};
        System.out.println(solution(phone_book));
    }
    //startWith 
    public static boolean solution(String[] phone_book){
        int n = phone_book.length;
        
        for(int i=0; i<n-1; i++){
            String num = phone_book[i];
            for(int j=i+1; j<n; j++){
                if(compare(num, phone_book[j])==false){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean compare(String s1, String s2){
        int i=0;
        while(s1.length()>s2.length()?i<s2.length():i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                return true;
            }
        }

        return false;
    }
}