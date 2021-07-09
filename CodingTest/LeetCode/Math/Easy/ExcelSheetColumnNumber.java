package CodingTest.LeetCode.Math.Easy;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length()-1; i++){
            char temp = s.charAt(i);
            answer = answer*26 + (temp-64)*26;
        }
        
        answer += s.charAt(s.length()-1)-64;
        //System.out.println(26*26*26+1);
        return answer;
    }
}
