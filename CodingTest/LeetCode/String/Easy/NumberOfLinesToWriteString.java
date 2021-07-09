package CodingTest.LeetCode.String.Easy;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int line = 1;
        int width = 0;
        
        for(char c:S.toCharArray()){
            int temp = widths[c-'a'];
            
            width += temp;
            
            if(width > 100){
                line++;
                width = temp;
            }
        }
        
        return new int[]{line, width};
    }
}
