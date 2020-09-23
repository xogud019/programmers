package BJ.DS;

import java.util.*;
import java.io.*;

public class Editor {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        //abcdx
        //0123
        int cursor = sb.length();
         
        for(int i=0; i<n; i++){
            String com = br.readLine();

            if(com.equals("L")){
                if(cursor > 0) cursor--;
                continue;
            }

            if(com.equals("D")){
                if(cursor != sb.length()) cursor++;
                continue;
            }
            if(com.equals("B")){
                if(cursor>0){
                    sb.deleteCharAt(cursor-1);
                    cursor--;
                    continue;
                }
                continue;
            }
            if(com.contains("P")){
                String[] arr = com.split(" ");
                sb.insert(cursor,arr[1]);
                cursor++;
                continue;
            }
        }
        System.out.println(sb.toString());
    }
}
