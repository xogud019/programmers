package Programmers.level2;

import java.util.*;

public class FileNameSort {
    public static void main(String[] args){
        String[] files ={"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] result = solution(files);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String[] file1 = disunite(s1);
                String[] file2 = disunite(s2);

                int headVal = file1[0].compareTo(file2[0]);

                if(headVal==0){
                    int num1 = Integer.parseInt(file1[1]);
                    int num2 = Integer.parseInt(file2[1]);

                    return num1-num2;
                }
                else{
                    return headVal;
                }
            }

            public String[] disunite(String s){
                String head ="";
                String number ="";
                String tail ="";
                int index = 0;

                for(; index<s.length(); index++){
                    char c = s.charAt(index);
                    if(c<'0'||c>'9'){
                        head+=c;
                    }        
                    else break;
                }

                for(; index<s.length(); index++){
                    char c = s.charAt(index);
                    if(c>='0'&&c<='9'){
                        number+=c;
                    }        
                    else break;        
                }

                for(; index<s.length(); index++){
                    char c = s.charAt(index);    
                    tail+=c;    
                }

                String[] file = {head.toUpperCase(),number , tail};
                return file;
            }
        });

        return files;
    }
}