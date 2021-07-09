package CodingTest.Programmers.level2;

import java.util.*;

public class NewsCluster {
    //not
    public static void main(String[] args){
        String str1=  "aa1+aa2";
        String str2=  "AAAA12";
        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2){
        char first;
        char second;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> inter = new ArrayList<>();

        for(int i=0; i<str1.length()-1; i++){
            first = str1.charAt(i);
            second = str1.charAt(i+1);
            
            if((first>='A'&&first<='Z')&&(second>='A'&&second<='Z')){
                str1List.add(first+""+second);
            }
        }
        /*
        for(int i=0; i<str1List.size(); ++i){
            System.out.println(str1List.get(i));
        }
        System.out.println();
        */
        for(int i=0; i<str2.length()-1; ++i){
            first = str2.charAt(i);
            second = str2.charAt(i+1);

            if((first>='A'&&first<='Z')&&(second>='A'&&second<='Z')){
                str2List.add(first+""+second);
                
            }
        }
        /*
        for(int i=0; i<str2List.size(); ++i){
            System.out.println(str2List.get(i));
        }
        */
        
       // System.out.println(union.size());

        for(int i=0; i<str1List.size(); ++i){
            if(str2List.remove(str1List.get(i))){
                inter.add(str1List.get(i));
            }
            union.add(str1List.get(i));
        }

        for(int i=0; i<str2List.size(); ++i){
            union.add(str2List.get(i));
        }

       
        return union.size()==0? 65536:(int)(((double)inter.size()/(double)union.size())*65536);
    }
}