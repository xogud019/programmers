package level1;

public class PYNumber {
    public static void main(String[] args){
        String s= "pPoooyY";
        System.out.println(solution(s));
    }

    public static boolean solution(String s){
        int pCount=0;
        int yCount=0;
        s= s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'){
                pCount++;
            }
            else if(s.charAt(i)=='y'){
                yCount++;
            }
        }

        if(pCount==0&&yCount==0){
            return true;
        }

        return (pCount==yCount)?true:false;
    }
}