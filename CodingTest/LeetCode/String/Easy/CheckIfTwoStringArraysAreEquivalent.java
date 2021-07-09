package CodingTest.LeetCode.String.Easy;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        String ss = "";
        
        for(String c:word1) s+=c;
        for(String c:word2) ss+=c;
        
        return s.equals(ss);
    }
}
