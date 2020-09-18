package Programmers.level2;

import java.util.*;

public class OpenChat {
    public static void main(String[] args){
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution(record);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }   
    
    public static String[] solution(String[] record){
        String[] answer ={};
        Map<String,String> userList = new HashMap<>();
        int count = 0;
        int index = 0;
        for(int i=0; i<record.length; i++){
            String[] temp = record[i].split(" ");
            if(temp[0].equals("Enter")){
                userList.put(temp[1], temp[2]);
            }
            else if(temp[0].equals("Change")){
                userList.put(temp[1], temp[2]);
                count--;
            }
            count++;
        }
        answer = new String[count];
        /*
        for(String k: userList.keySet()){
            System.out.println(k+","+userList.get(k));
        }
        System.out.println(count);
        */

        for(int i=0; i<record.length; i++){
            String[] temp = record[i].split(" ");
            
            if(temp[0].equals("Enter")){
                answer[index] = userList.get(temp[1])+"in";
            }
            else if(temp[0].equals("Leave")){ 
                answer[index] = userList.get(temp[1])+"out";
            }
            else if(temp[0].equals("Change")){
                continue;
            }
            index++;
        }
        return answer;
    }
}