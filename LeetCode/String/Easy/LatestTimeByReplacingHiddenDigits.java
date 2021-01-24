package LeetCode.String.Easy;
/*
You are given a string time in the form of hh:mm, where some of the digits in the string are hidden (represented by ?).

The valid times are those inclusively between 00:00 and 23:59.

Return the latest valid time you can get from time by replacing the hidden digits.

 

Example 1:

Input: time = "2?:?0"
Output: "23:50"
Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.

Example 2:

Input: time = "0?:3?"
Output: "09:39"

Example 3:

Input: time = "1?:22"
Output: "19:22"
 

Constraints:
1.time is in the format hh:mm.
2.It is guaranteed that you can produce a valid time from the given string.
*/
public class LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {
        String[] t = time.split(":");
        StringBuilder answer = new StringBuilder();
        //h
        for(int i=0; i<t[0].length(); i++){
            if(t[0].charAt(i) == '?' && i == 0){
                if(t[0].charAt(i+1) == '?'){
                    answer.append("2");
                    continue;
                }
                if(t[0].charAt(i+1)-'0' > 3){
                    answer.append("1");
                    continue;
                }
                else{
                    answer.append("2");
                    continue;
                }
            }
            if(t[0].charAt(i) == '?' && i == 1){
                if(answer.charAt(0) == '2'){
                    answer.append("3");
                    continue;
                }
                else{
                    answer.append("9");
                    continue;
                }
            }
            
            answer.append(""+t[0].charAt(i));
        }
        answer.append(":");
        //m
        for(int i=0; i<t[1].length(); i++){
            if(t[1].charAt(i) == '?' && i == 0){
                answer.append("5");
                continue;
            }
            
            if(t[1].charAt(i) == '?' && i == 1){
                answer.append("9");
                continue;
            }
            
            answer.append(""+t[1].charAt(i));
        }
        
        return answer.toString();
    }
}
