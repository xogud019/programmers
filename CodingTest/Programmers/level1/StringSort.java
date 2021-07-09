package CodingTest.Programmers.level1;
import java.util.*;

public class StringSort {
    public static void main(String[] args){
        //String[] strings = {"adds", "addd", "aafw"};
        String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
        int n =2;
        String[] result = solution(strings, n);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static String[] solution(String[] strings, int n){
       List<String> list= new ArrayList<>();
       String[] answer= new String[strings.length];
       for(int i=0; i<strings.length; i++){
           list.add(strings[i].charAt(n)+strings[i]);
       }
        
       Collections.sort(list);

       for(int i=0; i<list.size(); i++){
           answer[i]=list.get(i).substring(1,list.get(i).length());
       }
       return answer;
    }
    /*
    public static String[] solution(String[] strings, int n){
        String[] copy = strings;
        int index= n;
       
        for(int i=0; i<copy.length-1; i++){
            String temp="";
            for(int j=1; j<copy.length; j++){
                int count=0;
                while(copy[j-1].charAt(index)==copy[j].charAt(index)){
                    if(count==0&&index==n){
                        index =0;
                        count++;
                    }
                    else if(count!=0&&index!=n){
                        index++;
                        count++;
                    }
                    else if(count!=0&&index==n){
                        index++;
                        count++;
                    }
                }
                if(copy[j-1].charAt(index)>copy[j].charAt(index)){
                    temp = copy[j-1];
                    copy[j-1] = copy[j];
                    copy[j]=temp;
                }
                index=n;
            }
        }
        return copy;
    }
    */
    
}