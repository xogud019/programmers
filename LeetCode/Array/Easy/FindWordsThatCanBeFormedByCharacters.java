package LeetCode.Array.Easy;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] dic = new int[26];
        int answer = 0;
        
        for(int i=0; i<chars.length(); i++){
            dic[chars.charAt(i)-'a']++;
        }
        
        for(int i=0; i<words.length; i++){
            int[] temp = dic.clone();
            boolean isT = true;
            
            for(int j=0; j<words[i].length(); j++){
                temp[words[i].charAt(j)-'a']--;
            }
            
            for(int j:temp){
                if(j<0){
                    isT = false;
                    break;
                }    
            }
            
            if(isT) answer+=words[i].length();    
        }
        
        return answer;
    }
}
