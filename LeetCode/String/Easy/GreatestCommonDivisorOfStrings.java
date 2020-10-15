package LeetCode.String.Easy;
//try again
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length()>str2.length()) return gcdOfStrings(str2, str1);
        
        if(str1.equals(str2)) return str1;
        
        return str2.startsWith(str1) == true? gcdOfStrings(str1, str2.substring(str1.length())) : "";
    }
    /*falied case
    public String gcdOfStrings(String str1, String str2) {
        String answer = "";
        
        if(str1.charAt(0)!=str2.charAt(0)) return answer;
        
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<str1.length(); i++){
            set.add(str1.charAt(i));
        }
        
        for(int i=0; i<str2.length(); i++){
            set.add(str2.charAt(i));
        }
        
        if(set.size()>str1.length() ||set.size()>str2.length()) return answer;
        
        Iterator<Character> iter = set.iterator();
        
        while(iter.hasNext()){
            answer += iter.next();
        }
        
        return answer;
    }
    */
}
