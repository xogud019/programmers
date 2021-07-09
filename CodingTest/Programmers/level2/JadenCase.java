package CodingTest.Programmers.level2;


public class JadenCase {
    public static void main(String[] args){
        String s = " 3people   unFollowed me";
        System.out.println(solution(s));
    } 

    public static String solution(String s){
        String answer ="";
        s = s.replaceAll(" ", "_");
        String[] arr =  s.toLowerCase().split("_");
        
        for(int i=0; i<arr.length; i++){ 
            if(arr[i].equals("")){
                answer+=" ";
            }
            else if(arr[i].equals(" ")){
                answer+= " ";
                continue;
            }
            else{
                answer+=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1, arr[i].length())+" ";  
            }
        }
        if(s.substring(s.length() - 1, s.length()).equals(" ")){
            return answer+s.substring(s.length() - 1, s.length()).toUpperCase();
        }
        else{
            return answer.substring(0, s.length());
        }
    }
}